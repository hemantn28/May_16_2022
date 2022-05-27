package Set;

import java.util.HashSet;

public class HashSet_Working {
    public static void main(String[] args) {

        HashSet<Integer> integerHashSet=new HashSet<>();



        integerHashSet.add(5);
        integerHashSet.add(8);
        integerHashSet.add(3);
        integerHashSet.add(11);
        integerHashSet.add(8);
        integerHashSet.add(1);
        integerHashSet.add(11);
        integerHashSet.add(5);
       // integerHashSet.clear();

        integerHashSet.clone();
        System.out.println(integerHashSet.contains(58));
        System.out.println(integerHashSet.size());
        System.out.println(integerHashSet.remove(1));


        System.out.println(integerHashSet);

    }
}
