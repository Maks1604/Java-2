package Lab;

import java.util.ArrayList;

public class Person {
    public String getName() {
        return name;
    }

    public ArrayList<String> getPhone() {
        return phone;
    }

    public ArrayList<String> getEmail() {
        return email;
    }

    private String name;
    private ArrayList<String> phone;
    private ArrayList<String> email;

    Person(String name, ArrayList<String> phone, ArrayList<String> email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }


}
