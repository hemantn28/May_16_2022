package misclleaneous;

class Junior_Students extends Student{

    public static void study(){
        System.out.println("junior students study in school");

    }


}

public class Student {

    String name;
    int age;
   static String school;

   static {
       school="DAV";
   }

   public static void study(){
       System.out.println("students study in school");

   }

    public static void main(String[] args) {
       Junior_Students js=new Junior_Students();



    }
}




