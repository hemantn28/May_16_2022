package strings;

public class StringInternDemo {
    public static void main(String[] args) {

        String st1=new String("Geekyshows");
        String st2=st1.intern();
        System.out.println(st1==st2);

    }
}
