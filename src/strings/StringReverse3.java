package strings;

public class StringReverse3 {

    public static void main(String[] args) {

        StringBuffer r=new StringBuffer("Hemant Nagar");
        r=r.reverse();
        System.out.println(r);

        StringBuilder r1=new StringBuilder("Rahul Nagar");
        r1=r1.reverse();
        System.out.println(r1);
    }
}
