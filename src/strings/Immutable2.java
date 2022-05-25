package strings;

public class Immutable2 {

    public static void main(String[] args) {

        String a=new String("Rahul");
        System.out.println(a);

        String b=new String("Rahul");
        System.out.println(b);

        a=a.concat("kumar");
        System.out.println(a);
    }
}
