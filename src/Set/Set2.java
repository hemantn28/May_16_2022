package Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set2 {
    public static void main(String[] args) {
        Set<Integer> obj=new TreeSet<>();



        System.out.println(obj.add(15));
        System.out.println(obj.add(65));
        System.out.println(obj.add(97));
        System.out.println(obj.add(66));

        for(int var: obj){
            System.out.println(var);
        }
    }
}
