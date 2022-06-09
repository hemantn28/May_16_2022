package maps;

import java.util.HashMap;

public class HasMap_CWJ {
    public static void main(String[] args) {
        HashMap<String, Integer> empIds=new HashMap();

        empIds.put("John", 4125);
        empIds.put("George", 4785);
        empIds.put("Paul", 9134);
        empIds.put("Justin", 1267);
        empIds.put("Tom", 8043);

        System.out.println(empIds);
        //System.out.println(empIds.get("Paul"));
       // System.out.println(empIds.containsKey("Tom"));
       // System.out.println(empIds.containsValue(4125));
       /* empIds.put("Justin", 8023);
        System.out.println(empIds);*/

       /* empIds.replace("Justin",7774);
        System.out.println(empIds);*/

      /*  empIds.putIfAbsent("Danny",222);
        System.out.println(empIds);*/

        empIds.remove("Danny");
        System.out.println(empIds);
    }
}
