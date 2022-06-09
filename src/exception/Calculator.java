package exception;

import java.io.FileNotFoundException;
import java.sql.SQLDataException;

public class Calculator {

    public void divide(int a, int b){
        int result=0;
        System.out.println("*****before division");
        try {
             result=a/b;
        }
        catch (Exception e){
            System.out.println("Exception occured and catch so value will be zero");
        }

        finally {
            System.out.println("finally block execution");
        }
        System.out.println("*****After division");
        System.out.println("Division is " +result);


    }

    public void printArray(int arr[]){
        System.out.println();
        System.out.println("***Before print");
        try {
            System.out.println(arr[3]);
        }
        catch (Exception e){
            System.out.println("Exception occurred");
        }
        System.out.println("***After print");


    }

    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.divide(10,2);

        int arr[]={2,3,9};
        calculator.printArray(arr);
    }


}
