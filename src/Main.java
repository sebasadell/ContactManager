import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("CONTACT MANAGER");
        System.out.println("What would you like to do?");
        System.out.println("1: Add contact.");
        System.out.println("2. Search a number.");
        System.out.println("3. Get a list of all contacts.");
        ContactManager contacts = new ContactManager();
        boolean infinite = true;
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        while(infinite){
            switch (x){
                case 1:
                    System.out.println("Add name and number (AAAA:000000)");
                    String contact = input.next();
                    contacts.addContact(contact);
                    break;
                case 2:
                    System.out.println("Enter a name:");
                    String name = input.next();
                    contacts.getNumber(name);
                    break;
                case 3:
                    contacts.sortContacts();
                    break;
            }

            System.out.println("What would you like to do?");
            System.out.println("1: Add contact.");
            System.out.println("2. Search a number.");
            System.out.println("3. Get a list of all contacts.");
            System.out.println("4. Exit.");
            x = input.nextInt();
            if(x == 4){
                break;
            }
        }

    }
}