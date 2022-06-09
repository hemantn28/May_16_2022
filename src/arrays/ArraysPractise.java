package arrays;

public class ArraysPractise {
    public static void main(String[] args) {

        //Q 1. create an array of 5 floats and calculate their sum.

       // float distance[]={56.5f,14.9f,10.2f,73.0f,89.7f};
        /*float sum=0;

        // System.out.println(distance[2]);

        for (float var:distance
             ) {
            sum=sum+var;
        }System.out.println(sum);*/

        System.out.println();

        /*ystem.out.println("printing thru for loop");
        for (int i=0; i< distance.length; i++){

            System.out.println(distance[i]);
        }*/

       //Q 2. Write a programme to find out whether a given integer is present in an array or not.

        float distance[]={56.5f,14.9f,10.2f,73.0f,89.7f};

        float num=10.0f;
       boolean isInArray=false;

       for (float var:distance){
           if (num==var){
             isInArray = true;
               break;
           }
       }
       if (isInArray){
           System.out.println("The value is present in the Array : ");
       }
       else {
           System.out.println("The value is not present in the Array");
       }



    }
}
