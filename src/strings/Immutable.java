package strings;

public class Immutable {

    public static void main(String[] args) {

        String a="Hemant";
        System.out.println(a);

        String b="Hemant";
        System.out.println(b);

        a=a.concat("Vikas");
        System.out.println(a);

        String s1="hello";
        System.out.println(s1);

        String s2="hello";
        System.out.println(s2);

        s1=s1.concat(" hi");
        System.out.println(s1);


    }
}
