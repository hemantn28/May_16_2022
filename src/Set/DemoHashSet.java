package Set;

import java.util.HashSet;

public class DemoHashSet {

    public void createHashSet(){



        HashSet<String> stringHashSet=new HashSet<>();

        stringHashSet.add("Ravi");
        stringHashSet.add("Akash");
        stringHashSet.add("Ravi");
        stringHashSet.add("Somesh");
        stringHashSet.add("Prateek");
        stringHashSet.add("Umesh");
        stringHashSet.add("Yash");
        stringHashSet.add("Kartik");
        stringHashSet.add("Yash");
        stringHashSet.add("Nirbhay");



        for (String var: stringHashSet){
            System.out.println(var);
        }
    }

    public void createIntegerSet(){

        HashSet<Integer> integerHashSet=new HashSet<>();

        integerHashSet.add(5);
        integerHashSet.add(2);
        integerHashSet.add(18);
        integerHashSet.add(23);
        integerHashSet.add(20);
        integerHashSet.add(25);
        integerHashSet.add(9);
        integerHashSet.add(7);
        integerHashSet.add(25);
        integerHashSet.add(10);
        integerHashSet.add(1);
        integerHashSet.add(9);

        for (Integer var: integerHashSet){
            System.out.println(var);
        }
    }

    public static void main(String[] args) {
        DemoHashSet obj=new DemoHashSet();
        obj.createHashSet();
        obj.createIntegerSet();

    }
}
