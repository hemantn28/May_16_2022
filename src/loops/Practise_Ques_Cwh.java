package loops;

public class Practise_Ques_Cwh {
    public static void main(String[] args) {

        //Q.1 Write a programme to print first n natural numbers using do-while loop.

       /* int i=1;
        do {
            System.out.println("First 5 natural numbers: "+i);
            i++;
        }while (i<=5);*/

        //Q. 2 Write a programme to print first 5 odd numbers using for loop.

        /*int n=5;
        for (int i=0; i<5; i++){
            int result=2*i+1;
            System.out.println("first 5 odd numbers "+result);
        }*/

        //Q. 3 Write a programme to print first 5 odd numbers using while loop.

       /* int n=5;
        int i=0;
        while (i<5){
            int result=2*i+1;
            System.out.println("first 5 odd numbers using while loop "+result);
            i++;
        }*/

        //Q. 4 Write a programme to print first 5 odd numbers using do-while loop.

        /*int i=0;
        int n=5;
        do {
            int result=2*i+1;
            System.out.println("first 5 odd numbers using do-while loop "+result);
            i++;
        }while (i<5);*/

        //Q.5. Write a programme to print first 100 natural numbers in reverse order using for,while & do-while loop.


       /* for (int i=100; i>0; i--){
            System.out.println("first 100 natural numbers using For Loop: "+i);
        }*/

      /*  int i=100;
        while (i>0){
            System.out.println("first 100 natural numbers using while Loop: "+i);
            i--;
        }*/

       /* int i=100;
        do {
            System.out.println("first 100 natural numbers using do-while Loop: "+i);
            i--;
        }while (i>0);*/

        //Q.6 Write a programme to print first 5 even numbers using for,while & do-while loop.

        /*int n=5;
        for (int i=1; i<6; i++){
            int r=2*i;
            System.out.println("first 5 even numbers using for loop: "+r);
        }*/

       /* int n=5;
        int i=1;
        while (i<6){
            int r=2*i;
            System.out.println("first 5 even numbers using while loop: "+r);
            i++;
        }*/

        /*int i=1;
        int n=5;
        do {
            int r=2*i;
            System.out.println("first 5 even numbers using do-while loop: "+r);
            i++;
        }while (i<6);*/

        /*Q.7 Write a programme to print the following pattern.
         * * * * *
         * * * *
         * * *
         * *
         *
         */

        /*int n=5;
        for (int i=n; i>0; i--){
            for (int j=0;j<i; j++){
                System.out.print(" *");
            }

            System.out.print("\n");
        }*/
        /*int n=5;
        int i=n;
        while (i>0){
            System.out.println(" *");
            i--;
        }
        System.out.println("\n");*/


        //Q.8 write a programme to sum first 5 even numbers using all loops.

        /*int sum=1;
        int n=5;
       for (int i=1; i<n; i++){
           sum=sum+ (2*i);

       }  System.out.println(sum);
       */

      /* int n=5;
       int sum=1;
       int i=1;
       while (i<5){
           sum=sum+(2*i);
           i++;
       }
        System.out.println(sum);*/

       /* int n=5;
        int sum=1;
        int i=1;
        do {
            sum=sum+(2*i);
            i++;
        }while (i<5);
        System.out.println(sum);*/


        //Q.9 Print table of 12 using all loops.

       /* int n=12;
        for (int i=1; i<11; i++){
            int r=n*i;
            System.out.println(r);
        }*/

        /*int n=13;
        int i=1;
        while (i<11){
            int r=n*i;
            System.out.println(r);
            i++;
        }*/

       /* int n=14;
        int i=1;
        do {
            int r= n*i;
            System.out.println(r);
            i++;
        }while (i<11);*/

       /* int n=9;
        for (int i=10; i>0; i--){
            int r=n*i;
            System.out.println(r);
        }*/

       /* int n=15;
        int i=10;
        while (i>0){
            int r=n*i;
            System.out.println(r);
            i--;
        }*/

       /* int n=16;
        int i=10;
        do {
            int r=n*i;
            System.out.println(r);
            i--;
        }while (i>0);*/

        //Q.10 Write a programme to find the factorial of a given number using while loop.

      /* int n=5;
        int i=1;
        int factorial=1;
        while (i<=n){
            factorial *=i;
            i++;
        }
        System.out.println(factorial);*/

      /*  int n=5;
        int factorial=1;
        for (int i=1; i<=n; i++ ){
            factorial *=i;

        }System.out.println(factorial);*/

      /*  int n=5;
        int i=1;
        int factorial=1;

        do {
            factorial *=i;

            i++;
        }while (i<=n);
        System.out.println(factorial);*/

        //Q 11. Write a programme to calculate sum of the numbers occuring in the multiplication table of 8.

        int n = 12;
        int sum=0;
        for (int i = 1; i < 11; i++) {
            sum += n * i;
        }
        System.out.println(sum);
    }

}