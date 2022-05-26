package shallow_deep_copy;

public class Rectangle_Testing {
    public static void main(String[] args) {

        Rectangle r1=new Rectangle(2,3);
        Rectangle r2=new Rectangle();
        r2=r1;
        System.out.println("Area of r1 = "+ r1.area());

        System.out.println("Area of r2 = "+ r2.area());
    }
}
