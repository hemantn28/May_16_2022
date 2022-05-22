package conditionals;

public class Conditional_Statements {

    public static void main(String[] args) {
        int age=25;
        if (age>18){
            System.out.println("you are eligible for voting");
        }
        else {
            System.out.println("You are not eligible for voting");
        }

        int marks=79;
        if (marks>75){
            System.out.println("You got distinction");
        }
        else{
            System.out.println("No distinction");
        }
        int speed=100;
        if (speed>90){
            System.out.println("you are driving very fast");
        }
        else {
            System.out.println("you are driving slow");
        }

        int price=985;
        if (price>900){
            System.out.println("product is costly");
        }
        else {
            System.out.println("product is not costly");
        }

        String city="Chennai";
        if (city=="Delhi"){
        System.out.println("You are in Delhi");}
        else {
            System.out.println("You are not in Delhi");
        }

        String name="Pranav";
        if (name=="Nikesh"){
            System.out.println("You are the same");
        }
        else {
            System.out.println("You are not same");
        }

    }
}
