package strings;

public class StringReverseByOwnMethod3 {
    public static void main(String[] args) {

        int l;
        String r="Hemant Nagar";
        String r1="";
        l=r.length();

        for (int i=l-1; i>=0; i--){
            r1=r1+r.charAt(i);
        }
        System.out.println(r1);

    }
}
