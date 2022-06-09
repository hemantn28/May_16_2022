package maps;

import java.util.HashMap;

public class HashMapDemo {

    public void createHashMap(){

        HashMap<Integer,String> hashMap=new HashMap<>();

        hashMap.put(45,"Raman");
        hashMap.put(56,"Rohit");
        hashMap.put(64,"Navneet");
        hashMap.put(74,"Sachin");
        hashMap.put(1,"Rajan");
        hashMap.put(82,"Rohit");
        hashMap.put(33,"Rana");
        hashMap.put(91,"Mahesh");
        hashMap.put(23,"Kapoor");
        hashMap.put(40,"Raman");

      //  System.out.println(hashMap.get(1));

       // System.out.println(hashMap.remove(91));

       /* for(Integer var: hashMap.keySet()){
            System.out.println(hashMap.get(var));
        }*/

        System.out.println(hashMap.entrySet());

        System.out.println(hashMap.keySet());



    }

    public static void main(String[] args) {
        HashMapDemo obj=new HashMapDemo();
        obj.createHashMap();
    }
}
