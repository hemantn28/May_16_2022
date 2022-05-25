package mainmethod;

public class MultipleMainMethods {
    public static void main(String[] args) {
        System.out.println("Inside main 1");
        main("");
        main(1);
        main(2.5);
        main(8574963214L);
    }
    public static void main(String args) {
        System.out.println("Inside main 2");
    }

    public static int main(int args) {
        System.out.println("Inside main 3");
        return 0;
    }
    public static double main(double args) {
        System.out.println("Inside main 4");
        return 1.5;
    }
    public static long main(long args) {
        System.out.println("Inside main 5");
        return 5236415698L;
    }


}