package strings;

public class InternMethod3 {
    public static void main(String[] args) {

        String st1= new String("Hemant");
        String st2=st1.intern();
        System.out.println(st1==st2);

    }
}
