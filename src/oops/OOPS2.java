package oops;

class Boy{

    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name+ " " +age);
    }
}
public class OOPS2 {

    public static void main(String[] args) {

        Boy b1=new Boy();

       b1.printInfo("Rakesh");
       b1.printInfo(24);
       b1.printInfo("Rakesh", 24);


    }

}
