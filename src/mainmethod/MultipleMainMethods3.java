package mainmethod;

public class MultipleMainMethods3 {
    public static void main(String[] args) {

        System.out.println("Inside main 1");
        main(1);
        main(2.5);
        main('b');
        main(3.6f);
        main("kite");
    }


    public static int main(int args) {

        System.out.println("Inside main 2");
        return 0;
    }

    public static double main(double args) {

        System.out.println("Inside main 3");
        return 1.5;
    }

    public static char main(char args) {

        System.out.println("Inside main 4");
        return 'a';
    }

    public static float main(float args) {

        System.out.println("Inside main 5");
        return 1.4f;
    }

    public static void main(String args) {

        System.out.println("Inside main 6");

    }



}
