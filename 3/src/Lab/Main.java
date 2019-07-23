package Lab;

import java.util.ArrayList;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Words words = new Words(words());

        for (Map.Entry<String, Integer> o : words.wordsCount().entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
        System.out.println();

        PhoneBook phoneBook = fillPhoneBook();
        phoneBook.ToString();
        phoneBook.findEmail("Иванов");
        phoneBook.findPhone("Петров");
    }

    public static PhoneBook fillPhoneBook() {
        PhoneBook phoneBook = new PhoneBook();
        ArrayList<String> phones1= new ArrayList<>();
        phones1.add("586524598");
        phones1.add("5866738493");
        ArrayList<String> email1= new ArrayList<>();
        email1.add("mfhgy@email.ru");
        email1.add("mfjksdfg@email.ru");
        Person person1 = new Person("Петров",phones1,email1);
        ArrayList<String> phones2= new ArrayList<>();
        phones2.add("789236492938");
        phones2.add("7236492212444");
        ArrayList<String> email2= new ArrayList<>();
        email2.add("jlashnlfg@email.ru");
        email2.add("jlauwsadd@email.ru");
        Person person2 = new Person("Иванов",phones2,email2);
        phoneBook.add(person1).add(person2);
return phoneBook;
    }


    public static String[] words() {
        return new String[]{
                "абажур",
                "аббревиатура",
                "абитуриент",
                "абонемент",
                "аборт",
                "абракадабра",
                "абсент*",
                "авария",
                "авгур*",
                "автокефалия",
                "бурлак",
                "агломерат",
                "аграф*",
                "адепт",
                "адмирал*",
                "ажиотаж",
                "азарт",
                "акант",
                "аквилон*",
                "аккламация",
                "акколада",
                "аккордеон*",
                "аккордеон*",
                "акрибия",
                "акробатика",
                "бунгало*",
                "бунчук",
                "буран",
                "аборт",
                "бурлак",
                "бурлеск",
                "абракадабра",
                "бурт",
                "бурый",
                "бустрофедон",
                "бутафория",
                "абракадабра",
                "буханка*",
                "бухта",
                "бухта",
                "бучарда*",
                "аборт"

        };
    }
}
