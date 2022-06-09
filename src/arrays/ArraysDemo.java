package arrays;

public class ArraysDemo {

    public static void main(String[] args) {

        String cities[]={"Agra","Delhi","Jaipur","Bhopal","Chennai"};

       // System.out.println(cities[3]);
        //System.out.println(cities[1]);

        //for loop

        for (int ac=0; ac< cities.length; ac++){
            System.out.println(cities[ac]);
        }

        System.out.println();
        System.out.println("In revers order");
        for (int ac=cities.length-1; ac>=0; ac--){
            System.out.println(cities[ac]);
        }

        System.out.println();

        //advance for loop

        System.out.println("printing thru advance for loop");

        for (String var: cities){
            System.out.println(var);
        }

        int marks[]={25,36,47,18,33,25};

        System.out.println("thru for loop");

        for (int as=0;as<marks.length; as++){
            System.out.println(marks[as]);
        }
        System.out.println();

        System.out.println("in reverse order");
        for (int as=marks.length-1; as>=0; as--){
            System.out.println(marks[as]);
        }

        System.out.println("printing thru advance for loop");

        for (int element:marks){
            System.out.println(element);
        }

        System.out.println();

        System.out.println(marks[2]);

        System.out.println();

        double price[]={85.6,45.7,98.1,47.1,30.2,90.8};

        System.out.println("thru for loop");

        for (int af=0; af< price.length;af++){
            System.out.println(price[af]);
        }

        System.out.println();

        System.out.println("thru advance for loop");
        for (double var:price){
            System.out.println(var);
        }

        System.out.println(price.length);

    }
}
