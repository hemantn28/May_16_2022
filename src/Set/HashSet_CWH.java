package Set;

import java.util.HashSet;

public class HashSet_CWH {
    public static void main(String[] args) {

        HashSet<Integer> integerHashSet=new HashSet<>();

        integerHashSet.add(2);
        integerHashSet.add(9);
        integerHashSet.add(2);
        integerHashSet.add(3);
        integerHashSet.add(4);
        integerHashSet.add(3);

       // System.out.println("Printing normally");
      //  System.out.println(integerHashSet);

      //  System.out.println(integerHashSet.contains(9));
      //  System.out.println(integerHashSet.contains(58));

       // System.out.println(integerHashSet.size());

       // integerHashSet.clear();

        System.out.println(integerHashSet.clone());

        /*  System.out.println("Printing thru Advance for loop");
        for (Integer var: integerHashSet){
            System.out.println(var);
        }*/
    }
}
