package strings;

public class StringReverseByOwnMethod2 {
    public static void main(String[] args) {

        int l,i;
        String n="leran java";
        String n2="";
        l=n.length();

        for (i=l-1; i>=0; i--){
            n2=n2+n.charAt(i);
        }
        System.out.println(n2);
    }
}
