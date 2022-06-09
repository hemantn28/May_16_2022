package Set;

import java.util.HashSet;

public class HashSetExerciseOnline {
    public static void main(String[] args) {

        //Q.1.Write a Java program to test a hash set is empty or not.

        HashSet<String> hashSet=new HashSet<>();

        hashSet.add("red");
        hashSet.add("green");
        hashSet.add("blue");
        hashSet.add("yellow");
        hashSet.add("white");
        hashSet.add("blue");
        hashSet.add("red");

       /* System.out.println("Original HashSet: "+hashSet);
        System.out.println(hashSet.isEmpty());
        hashSet.removeAll(hashSet);
        System.out.println("HashSet after removing all elements: "+hashSet);*/

        //Check if the HashSet contains the specific elements.
       // System.out.println(hashSet.contains("purple"));

        //removing elements from set
     /*   System.out.println(hashSet.remove("green"));
        System.out.println(hashSet);*/

        //removing all of the elements present in the set
     /*   hashSet.clear();
        System.out.println(hashSet);*/

    }
}
