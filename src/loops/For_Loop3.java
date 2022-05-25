package loops;

public class For_Loop3 {

    public static void main(String[] args) {

        for (int i=0; i<5; i++){
            System.out.println("hello "+i);
        }

        for (int i=5; i>0; i--){
            System.out.println("india "+i);
        }

        for (int j=6; j<10; j++){
            System.out.println("namaskar "+j);
        }
        for (int k=9; k>4; k--){
            System.out.println("hi "+k);
        }

        for (int m=100; m>95;m--){
            System.out.println("count "+m);
        }

        for (int h=98; h<105; h++){
            System.out.println("hello "+h);
        }

        //Q.Write a programme to print first n odd numbers using a for loop.

        int n=5;
        for (int i=0; i<5; i++){
            System.out.println(2*i+1);
        }

        //Q.Write a programme to print first n even numbers using a for loop.

        System.out.println("First 5 even numbers ");
        int m=5;
        for (int i=1; i<=5; i++){
            System.out.println(2*i);
        }

        //Q.Write a programme to print first n natural numbers using a for loop.


        for (int i=5; i>0; i--){
            System.out.println("Natural Numbers In Reverse Order = "+i);
        }

        //Write a programme to print first n odd numbers using a for loop.


        for (int i=0; i<5; i++){
            int result=2*i+1;
            System.out.println("odd numbers "+result);
        }


    }
}
