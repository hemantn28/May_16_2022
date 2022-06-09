package arrays;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {

        ArrayList arrayList=new ArrayList<>();

        arrayList.add("Str1");
        arrayList.add(58);
        arrayList.add(73);
        arrayList.add(19);
        arrayList.add(23);

        int a=(int)arrayList.get(0);

        System.out.println(a);




    }
}
