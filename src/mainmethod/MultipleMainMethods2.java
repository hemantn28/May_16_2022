package mainmethod;

public class MultipleMainMethods2 {
    public static void main(String[] args) {
        System.out.println("Inside main 1");
        main(1);
        main(1.5);
        main("Main Method");
        main(7854693251L);
        main1("");
    }

    public static int main(int args) {
        System.out.println("Inside main 2");
        return 0;
    }
    public static double main(double args) {
        System.out.println("Inside main 3");
        return 0.5;
    }
    public static String main(String args) {
        System.out.println("Inside main 4");
        return "Main Method";
    }
    public static void main1(String args) {
        System.out.println("Inside main 5");

    }
    public static long main(long args) {
        System.out.println("My mobile no. is 7854693251L");
        return 7854693251L;
    }

}
