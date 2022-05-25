package object_class_methods;

public class Objects_Class_Methods {

    public static void main(String[] args) {

        Objects_Class_Methods obj=new Objects_Class_Methods();

        Objects_Class_Methods obj1=new Objects_Class_Methods();

        System.out.println("toString method of obj: "+obj.toString());

        System.out.println("toString method of obj1: "+obj1.toString());

        System.out.println("hashcode method of obj: "+obj.hashCode());

        System.out.println("hashcode method of obj1: "+obj1.hashCode());

        System.out.println("equals method of obj: "+obj.equals(obj1));

        System.out.println("equals method of obj: "+obj1.equals(obj));

        System.out.println("equals method of obj: "+obj1.equals(obj1));

        System.out.println("equals method of obj: "+obj.equals(obj));

        System.out.println("getclass method of obj: "+obj.getClass());

        System.out.println("getclass method of obj1: "+obj1.getClass());




    }
}
