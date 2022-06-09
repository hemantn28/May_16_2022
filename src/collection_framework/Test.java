package collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<String> mobiles=new ArrayList<>();

        mobiles.add("Redmi");
        mobiles.add("Realme");
        mobiles.add("Samsung");
        mobiles.add("Apple");

        //printing Arraylist before removing any element.
          System.out.println("Mobiles are: "+mobiles);


       /* for (String var: mobiles){
            System.out.println(var);
        }*/

        //remove any element from Arraylist
        //System.out.println(mobiles.remove(1));

        /*for (String var: mobiles){
            if (var.equals("Realme")){
                mobiles.remove(var);
            }
        }*/

        Iterator<String> itr=mobiles.iterator();
        while (itr.hasNext()){
            String var= itr.next();
            if (var.equals("Realme")){
                itr.remove();
            }


        }
        //printing element after removing element

        System.out.println(mobiles);

        }
    }

