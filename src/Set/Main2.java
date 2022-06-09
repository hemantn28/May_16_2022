package Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {

       /* System.out.println("HashSet");
       Set<Integer> hashset=new HashSet<>();

        hashset.add(5);
        hashset.add(8);
        hashset.add(9);
        hashset.add(5);
        hashset.add(3);
        hashset.add(1);
        hashset.add(10);
        hashset.add(1);


        System.out.println(hashset.isEmpty());
        System.out.println( hashset.contains(1));
        System.out.println(hashset.remove(23));
        hashset.clear();

        for (int var: hashset){
            System.out.println(var);
        }*/


        System.out.println("\n");

        System.out.println("TreeSet");
        Set<Integer> treeset= new TreeSet<>();

        treeset.add(45);
        treeset.add(12);
        treeset.add(45);
        treeset.add(91);
        treeset.add(49);
        treeset.add(47);
        treeset.add(12);
        treeset.add(47);
        treeset.add(25);
        treeset.add(1);

        System.out.println(treeset.isEmpty());
        System.out.println(treeset.contains(18));
        System.out.println(treeset.remove(1));
        treeset.clear();

        for (int var: treeset){
            System.out.println(var);
        }
    }
}
