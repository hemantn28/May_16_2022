package Set;

import java.util.HashSet;

public class DemoHashSet2 {
    public static void main(String[] args) {

        HashSet<String> hashSet=new HashSet<>();

        hashSet.add("India");
        hashSet.add("China");
        hashSet.add("France");
        hashSet.add("Spain");
        hashSet.add("France");
        hashSet.add("India");
        hashSet.add("Canada");
        hashSet.add("Mexico");
        hashSet.add("Spain");

       /* for (String var: hashSet){
            System.out.println(var);
        }*/

        //System.out.println(hashSet.contains("Mexico"));

        //System.out.println(hashSet.size());

        //System.out.println(hashSet.removeAll(hashSet));

       // System.out.println(hashSet.isEmpty());


    }
}
