package strings;

public class StringInternDemo2 {
    public static void main(String[] args) {
        String s1="Vikas";
        String s2="Vikas";
        String s3=new String("Vikas");
        String s4=s3.intern();
        System.out.println(s1==s4);
    }
}
