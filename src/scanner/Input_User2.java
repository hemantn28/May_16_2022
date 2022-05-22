package scanner;

import java.util.Scanner;

public class Input_User2 {

    public static void main(String[] args) {

        System.out.println("taking input from user");
        Scanner sc=new Scanner(System.in);
       /* System.out.println("Enter the value of a ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b ");
        int b=sc.nextInt();

        int subtraction=a-b;
        System.out.println("subtraction is "+subtraction);*/

        /*System.out.println("enter value of num 1");
        double a=sc.nextDouble();

        System.out.println("enter value of num 2");
        double b=sc.nextDouble();

        double multiply=a*b;
        System.out.println("multiplication is "+multiply);*/

       /* System.out.println("Enter value of number 1");
        float a=sc.nextFloat();

        System.out.println("Enter value of number 2");
        float b=sc.nextFloat();

        float division=a/b;
        System.out.println("division is "+division);*/

       // System.out.println(sc.hasNextDouble());
       // System.out.println(sc.hasNextInt());
      //  System.out.println(sc.hasNextLine());

        //.Write a programme to calculate % of a student in exam. His marks from 5 subjects must be taken as input from user.

        System.out.println("enter marks in sst");
        double sst=sc.nextDouble();

        System.out.println("enter marks in hindi");
        double hindi=sc.nextDouble();

        System.out.println("enter marks in english");
        double english=sc.nextDouble();

        System.out.println("enter marks in science");
        double science=sc.nextDouble();

        System.out.println("enter marks in maths");
        double maths=sc.nextDouble();

        double totalMarks=sst+hindi+english+science+maths;
        System.out.println("Total Marks "+totalMarks);

        double averageMarks= totalMarks/50;
        System.out.println("Average of marks = "+averageMarks);

        double percentage=(totalMarks*100)/500;
        System.out.println("Percentage is "+percentage);







    }
}
