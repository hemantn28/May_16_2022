package Set;

import javafx.scene.effect.SepiaTone;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Integer> hashset= new HashSet<>();
        hashset.add(23);
        hashset.add(4);
        hashset.add(4);
        hashset.add(4);
        hashset.add(10);

        for (int var: hashset){
            System.out.println(var + " ");
        }
        System.out.println(hashset.isEmpty());
        System.out.println(hashset.contains(9));
        System.out.println(hashset.remove(23));
        hashset.clear();
        System.out.println(hashset);
        System.out.println("\n");

        System.out.println("Treeset");

        Set<Integer> treeset=new TreeSet<>();
        treeset.add(23);
        treeset.add(4);
        treeset.add(4);
        treeset.add(4);
        treeset.add(10);
        treeset.add(1);

        for (int var: treeset){
            System.out.println(var + " ");
        }



    }
}
