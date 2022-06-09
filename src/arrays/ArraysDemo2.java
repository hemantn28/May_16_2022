package arrays;

public class ArraysDemo2 {
    public static void main(String[] args) {
        //1. Declaration
        // Memory Allocation

        /*int marks[];
        marks =new int[5];*/

        //2. Declaration & Memory Allocation

        String cities[]=new String[6];

        cities[0]="Jaipur";
        cities[1]="Palwal";
        cities[2]="Kanpur";
        cities[3]="Lucknow";
        cities[4]="Allahabad";
        cities[5]="Kanpur";

        for (String var:cities
             ) {
            System.out.println(var);
        }

        //3.Declaration + Initialization

        System.out.println();

        String names[]={"Vikas", "Rahul","Shivam","Kapil"};

        for (int i=0;i< names.length;i++){
            System.out.println(names[i]);
        }



    }
}
