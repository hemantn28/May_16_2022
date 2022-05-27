package Set;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {

        HashMap<String,Integer> empIds=new HashMap<>();

        empIds.put("john",12345);
        empIds.put("Carl",54321);
        empIds.put("Jerry",8675309);

        System.out.println(empIds.get("Carl"));

        System.out.println(empIds.containsKey("Jerry"));
        System.out.println(empIds.containsValue(6));
        empIds.put("John",98765);



        System.out.println(empIds);

    }
}
