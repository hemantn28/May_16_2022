package variables;

public class MainClass {
    public static void main(String[] args) {

        MainClass m= new MainClass();

        MainClass m1= new MainClass();

        System.out.println("toString method :"+m.toString());

        System.out.println("hashcode method: "+m.hashCode());

        System.out.println("equals method: "+m1.equals(m));

        System.out.println("get class method: "+m.getClass());

    }
}
