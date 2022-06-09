package oops;

class Pen{

    String color;
    String type;

    public void write(){
        System.out.println("writes anything");
    }

    public void printColor(){
        System.out.println(this.color);
    }
    public void printType(){
        System.out.println(this.type);
    }
}
class Student{

    String name;
    int age;

    Student(){

    }

    public void study(){
        System.out.println("student studies");
    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age){
        this.name=name;
        this.age=age;
    }
}

class Scholar{
    String name;
    int age;
    static String school;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name + " "+age);
    }

    public static void study(){
        System.out.println("scholars study");
    }
}

class Shape{

    String color;

    public void area(){

    }
}

class Triangle {

}

public class OOPS {
    public static void main(String[] args) {

       /* Pen pen1=new Pen();
        pen1.color="blue";
        pen1.type="gel pen";
        pen1.write();
        pen1.printColor();
        pen1.printType();

        Pen pen2=new Pen();
        pen2.color="black";
        pen2.type="ball point";
        pen2.write();
        pen2.printType();
        pen2.printColor();

        Pen pen3=new Pen();
        pen3.color="yellow";
        pen3.type="ink";
        pen3.write();
        pen3.printColor();
        pen3.printType();*/

        Student student1=new Student("Aman",24);
        //student1.printInfo();
          student1.study();

          Scholar sch1=new Scholar();
        /*sch1.name="Ramesh";
        sch1.age=20;
        sch1.printInfo(sch1.name);
        sch1.printInfo(sch1.age);
        sch1.printInfo(sch1.name, sch1.age);*/
       // Scholar.school="ABC";
        //System.out.println(Scholar.school);
        //Scholar.study();

       /* Triangle t1=new Triangle();
        t1.color="red";
        t1.area();*/

        Student2 student2=new Student2();
        student2.study();

        Student3 student3=new Student3();
        student3.study();


    }
}
