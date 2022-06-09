package misclleaneous;

public class StaticVsNonStatic {

    int a=10;
    static int y=30;

    public static void main(String[] args) {

        int x=20;
        System.out.println("Local variable: "+x);
        System.out.println("static variable: "+y);

    }
}
