package conditionals;

public class Nested_Conditionals {

    public static void main(String[] args) {

        //AND OPERATOR

        int age=19;
        String city="Bikaner";
        if (age>18 && city=="Bangalore"){
            System.out.println("You are eligible for voting in Bangalore");
        }
        else {
            System.out.println("U r not eligible for voting");
        }

        //NOT OPERATOR

        if (!(age>18 && city=="Pune")){
            System.out.println("You are eligible for voting in Bangalore");
        }
        else {
            System.out.println("U r not eligible for voting");
        }

        //OR OPERATOR

        int marks=80;
        String subject="Maths";

       /* if (marks>75 || subject=="Maths"){
            System.out.println("You got distinction in Maths");
        }
        else {
            System.out.println("You did not get distinction in Maths");
        }*/

        //NOT OPERATOR

        if (marks>75 || !(subject=="Maths")){
            System.out.println("You got distinction in Maths");
        }
        else {
            System.out.println("You did not get distinction in Maths");
        }





    }
}
