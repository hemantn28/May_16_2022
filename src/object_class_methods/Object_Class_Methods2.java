package object_class_methods;

class Employee{

    String name="Einstein";
    int age=24;
    String dept="IT";

    public void work(){
        System.out.println("Einstein works");
    }
}
public class Object_Class_Methods2 {
    public static void main(String[] args) {

        Employee emp1=new Employee();

        Employee emp2=new Employee();

        System.out.println("toString method of emp1: "+ emp1.toString());

        System.out.println("toString method of emp2: "+ emp2.toString());

        System.out.println("hashcode method of emp1: "+emp1.hashCode());

        System.out.println("hashcode method of emp2: "+emp2.hashCode());

        System.out.println("equals method of emp1: "+ emp1.equals(emp1));

        System.out.println("equals method of emp2: "+ emp2.equals(emp1));

        System.out.println("getClass method of emp1: "+emp1.getClass());

        System.out.println("getClass method of emp2: "+emp2.getClass());
    }
}
