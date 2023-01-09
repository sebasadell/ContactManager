import java.util.Arrays;

public class ContactManager {
    private String[] list = new String[0];

    public ContactManager (){
    }

    public void addContact(String contact){
        if(list == null){
            list = new String[1];
            list[0] = contact;
        }
        else{
            String[] aux = new String[list.length + 1];
            for(int i = 0; i < list.length; i++){
                aux[i] = list[i];
            }
            aux[aux.length - 1] = contact;
            list = aux;
        }
        }

    public void getNumber(String name){
        int length = name.length();
        boolean matches = false;
        for(int i = 0; i < list.length; i++){
            if(list[i].regionMatches(0, name, 0, length)){
                String[] number = list[i].split(":");
                System.out.println(number[1]);
            }
        }
    }

    public void sortContacts(){
        Arrays.sort(list);
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
    }
}
