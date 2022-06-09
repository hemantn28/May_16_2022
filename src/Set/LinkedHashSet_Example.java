package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSet_Example {
    public static void main(String[] args) {

        LinkedHashSet<Integer> integerLinkedHashSet=new LinkedHashSet<>();

        System.out.println("LinkedHashSet");
        integerLinkedHashSet.add(89);
        integerLinkedHashSet.add(101);
        integerLinkedHashSet.add(47);

        for (Integer var: integerLinkedHashSet){
            System.out.println(var);
        }

        System.out.println();
        System.out.println("TreeSet");

        TreeSet<Integer> integerTreeSet=new TreeSet<>();

        integerTreeSet.add(89);
        integerTreeSet.add(101);
        integerTreeSet.add(47);

        for (Integer var: integerTreeSet){
            System.out.println(var);
        }

        System.out.println();
        System.out.println("HashSet");

        HashSet<Integer> integerHashSet=new HashSet<>();

        integerHashSet.add(89);
        integerHashSet.add(101);
        integerHashSet.add(47);

        for (Integer var: integerHashSet){
            System.out.println(var);
        }

    }
}
