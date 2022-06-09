package super_this_keyword;

class Pen{

    String color;
    String type;

    public void write(){
        System.out.println("writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }

    public void printType(){
        System.out.println(this.type);
    }

}
public class Main {
    public static void main(String[] args) {

        Pen pen1=new Pen();
        Pen pen2=new Pen();
        Pen pen3=new Pen();

        pen1.color="blue";
        pen1.type="gel";

        pen2.color="black";
        pen2.type="ball point";

        pen3.color="red";
        pen3.type="ink";

        pen1.write();
        pen1.printColor();
        pen1.printType();


        pen2.printColor();
        pen2.printType();

        pen3.printColor();
        pen3.printType();






    }
}
