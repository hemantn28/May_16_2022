package Final_Static;



public class Student {
    String name;
    static String school;
    int i=5;

    public static void study(){
        System.out.println("Students study");
    }

    public static void main(String[] args) {

        Student.school="Modern School";
        Student.study();
        System.out.println(Student.school);


    }
}
