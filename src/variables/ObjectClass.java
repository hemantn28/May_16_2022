package variables;

public class ObjectClass {

    public static void main(String[] args) {

        ObjectClass oc=new ObjectClass();

        ObjectClass oc1=new ObjectClass();

        System.out.println("toString method: "+oc.toString());

        System.out.println("hashcode method: "+oc.hashCode());

        System.out.println("equals method: "+oc.equals(oc1));

        System.out.println("get class method: "+oc.getClass());

        String str="Hemant";

        String str1="Hemant";
    }
}
