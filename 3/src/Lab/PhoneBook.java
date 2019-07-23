package Lab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private HashMap<String,Contact> phoneBook;
    PhoneBook(){
        phoneBook = new HashMap<>();

    }
    public PhoneBook add (Person person){
        phoneBook.put(person.getName(),new Contact(person.getPhone(),person.getEmail()));
        return this;
    }
    public void findEmail(String name){
        System.out.println(name);
            for (String email:phoneBook.get(name).getEmail()) {
                System.out.println("\t" + email);
            }
    }
    public void findPhone(String name){
        System.out.println(name);
        for (String phone:phoneBook.get(name).getPhone()) {
            System.out.println("\t" + phone);
        }
    }
    public void ToString(){
        for (Map.Entry<String, Contact> o : phoneBook.entrySet()) {
            System.out.println(o.getKey() + ": ");
            for (String email:o.getValue().getEmail()) {
                System.out.println("\t" + email);
            }
            for (String phone:o.getValue().getPhone()) {
                System.out.println("\t" + phone);
            }
        }

    }
}
    

class Contact{
    private ArrayList<String> phone;
    private ArrayList<String> email;
    public ArrayList<String> getPhone() {
        return phone;
    }

    public ArrayList<String> getEmail() {
        return email;
    }

    public Contact(ArrayList<String> phone, ArrayList<String> email) {
        this.phone = phone;
        this.email = email;
    }
}
