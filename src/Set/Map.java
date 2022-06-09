package Set;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String,String> phonebook=new HashMap<>();

        phonebook.put("Ajay", "8796314589");
        phonebook.put("Lokesh", "9643158729");
        phonebook.put("Sonam", "6390183427");
        phonebook.put("Vipin", "9034126347");
        phonebook.put("Ajeet", "9873265147");
        phonebook.put("Shweta", "8630913426");

        System.out.println(phonebook.get("Ajeet"));

        System.out.println(phonebook.keySet());
        System.out.println(phonebook.entrySet());


    }
}
