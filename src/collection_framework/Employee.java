package collection_framework;

import java.util.ArrayList;
import java.util.Collections;

public class Employee {
    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList=new ArrayList<>();

        integerArrayList.add(4);
        integerArrayList.add(7);
        integerArrayList.add(9);
        integerArrayList.add(1);
        integerArrayList.add(3);
        integerArrayList.add(6);

        Collections.sort(integerArrayList);
        Collections.shuffle(integerArrayList);
        Collections.reverse(integerArrayList);

        System.out.println(integerArrayList);
    }
}
