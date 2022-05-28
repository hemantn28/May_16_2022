package scanner;

import java.util.Scanner;

public class Practise_Ques {
    public static void main(String[] args) {

        //Q 1. Write a program to take two integer inputs from user and print sum and product of them.

        Scanner sc=new Scanner(System.in);

        /*System.out.println("Enter the number 1");
        int a=sc.nextInt();

        System.out.println("Enter the number 2");
        int b= sc.nextInt();

        int c=a*b;
        int d=a+b;

        System.out.println("Multiplication is ="+c);
        System.out.println("Addition is ="+d);*/

        //Q 2. Take two integer inputs from user. First calculate the sum of two then product of two.
        // Finally, print the sum and product of both obtained results.

       /* System.out.println("Enter num 1");
        int a=sc.nextInt();

        System.out.println("Enter num 2");
        int b=sc.nextInt();

        int sum=a+b;
        int Multiplication=a*b;

        System.out.println("Addition is ="+sum);
        System.out.println("Multiplication is ="+Multiplication);

        System.out.println("Sum of obtained sum ="+(sum+Multiplication));
        System.out.println("Sum of obtained Multiplication ="+(sum*Multiplication));*/

        //Q 3. Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.

       /* System.out.println("Enter length of rectangle =");
        double r=sc.nextDouble();

        System.out.println("Enter breadth of rectangle =");
        double b=sc.nextDouble();

        double Area=r*b;
        System.out.println("Area of rectangle= "+(int)Area);*/

        //Q 4. Take name, roll number and field of interest from user and print in the format below :
        //Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.

      /*  System.out.print("Enter name: ");
        String name=sc.nextLine();

        System.out.print("Enter rollNo: ");
        int rollNo=sc.nextInt();

        System.out.print("Enter interest: ");
        sc.nextLine();
        String interest=sc.nextLine();

        System.out.println("Hey, my name is "+name+" and my roll number is "+rollNo+" .My field of interest are "+interest);*/


      //Q 5. Take side of a square from user and print area and perimeter of it.

       /* System.out.println("Enter the side of square: ");
        int side=sc.nextInt();

        int area=side*side;
        int perimeter=4*side;

        System.out.println("Area of square = "+area);

        System.out.println("Perimeter of square = "+perimeter);*/

        //Q 6. Write a program to find square of a number.
        //E.g.-
        //INPUT : 2        OUTPUT : 4
        //INPUT : 5        OUTPUT : 25

      /*  System.out.print("Enter the number: ");
        int number=sc.nextInt();

        int square=number*number;

        System.out.println("square of given number is "+square);*/

        // Q 7. Take 3 inputs from user and check :
        //all are equal
        //any of two are equal
        //( use && || )

       /* System.out.print("Enter the num a: ");
        int a=sc.nextInt();

        System.out.print("Enter the num b: ");
        int b=sc.nextInt();

        System.out.print("Enter the num c: ");
        int c=sc.nextInt();

        if (a==b && b==c && c==a){
            System.out.println("All are equal");
        }
        else if (a==b && b==a){
            System.out.println("Any two are equal");
        }
        else if (a==c && c==a){
            System.out.println("Any two are equal");
        }

        if (a==b || b==a || c==a){
            System.out.println("All are equal");
        }
        else if (a==b || b==a){
            System.out.println("Any two are equal");
        }
        else if (a==c || c==a){
            System.out.println("Any two are equal");
        }*/

        //Q 8. Write a program to enter the values of two variables 'a' and 'b' from keyboard and
        // then check if both the conditions 'a < 50' and 'a < b' are true.

       /* System.out.print("Enter value of a: ");
        int a= sc.nextInt();

        System.out.print("Enter value of b: ");
        int b=sc.nextInt();

        if (a<50){
            System.out.println("It is true");
        }
        else {
            System.out.println("It is false");
        }

        if (a<b){
            System.out.println("It is true");
        }
        else {
            System.out.println("It is false");
        }*/

        //Q 9. If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
        // write a program to calculate his total marks and percentage marks.

        System.out.print("Enter marks in Physics: ");
        double Physics=sc.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        double Chemistry=sc.nextInt();

        System.out.print("Enter marks in Maths: ");
        double Maths=sc.nextInt();

        double obtainedMarks=Physics+Chemistry+Maths;
        System.out.println("Obtained marks are: "+obtainedMarks);

        double averageMarks= obtainedMarks/30;
        System.out.println("Average Marks are: "+averageMarks);

        double percentage= (obtainedMarks*100)/300;
        System.out.println("Percentage is: "+percentage);




    }
}
