package conditionals;

public class Nested_Conditionals2 {
    public static void main(String[] args) {

        //AND OPERATOR
        int age=19;
        String city="Lucknow";
        if (age>18 && city=="Lucknow"){
            System.out.println("you are eligible for voting in Lucknow");
        }
        else {
            System.out.println("You are not eligible for voting");
        }

        //NOT OPERATOR
        if (age>18 && !(city=="Lucknow")){
            System.out.println("you are eligible for voting in Lucknow");
        }
        else {
            System.out.println("You are not eligible for voting");
        }

        //OR OPERATOR

        int marks=80;
        String subject="Maths";
        if (marks>75 || subject=="Maths"){
            System.out.println("you got distinction in maths");
        }
        else{
            System.out.println("you did not get distinction ");
        }

        //NOT OPERATOR
        if (marks>75 || !(subject=="Maths")){
            System.out.println("you got distinction in maths");
        }
        else{
            System.out.println("you did not get distinction ");
        }

    }
}
