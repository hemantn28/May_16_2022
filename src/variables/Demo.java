package variables;

public class Demo {

    public static void main(String[] args) {

        int a=45;
        int b=45;
        int result=a+b;
        System.out.println("addition is "+result);
        main("");
        main(1);
    }

    public static void main(String happy) {

        int a=46;
        int b=45;
        int result2=a+b;
        System.out.println("addition is "+result2);
    }

    public static int main(int happy) {

        int a=47;
        int b=47;
        int result3=a+b;
        System.out.println("addition is "+result3);
        return 0;

    }

    public String toString(){
        return getClass().getName()+"@"+Integer.toHexString(hashCode());
    }

}
