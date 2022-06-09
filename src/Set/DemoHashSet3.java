package Set;

import java.util.HashSet;

public class DemoHashSet3 {
    public static void main(String[] args) {

        HashSet<Integer> integerHashSet=new HashSet<>();

        integerHashSet.add(56);//Index No. =0 & Hash Function: f(x)=6
        integerHashSet.add(81);//Index No. =1 & Hash Function: f(x)=2
        integerHashSet.add(74);//Index No. =2 & Hash Function: f(x)=4
        integerHashSet.add(69);//Index No. =3 & Hash Function: f(x)=9
        integerHashSet.add(63);//Index No. =4 & Hash Function: f(x)=3
        integerHashSet.add(58);//Index No. =5 & Hash Function: f(x)=5
        integerHashSet.add(90);//Index No. =6 & Hash Function: f(x)=4
        integerHashSet.add(45);//Index No. =7 & Hash Function: f(x)=5
        integerHashSet.add(92);//Index No. =8 & Hash Function: f(x)=2
        integerHashSet.add(67);//Index No. =9 & Hash Function: f(x)=5

        /*for (Integer var: integerHashSet){
            System.out.println(var);
        }*/

        //System.out.println(integerHashSet);

        //System.out.println(integerHashSet.contains(99));

       // System.out.println(integerHashSet.size());

        integerHashSet.clear();

        for (Integer var: integerHashSet) {
            System.out.println(var);
        }





        }
}
