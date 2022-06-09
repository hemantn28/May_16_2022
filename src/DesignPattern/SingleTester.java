package DesignPattern;

public class SingleTester {

    public static void main(String[] args) {

        //Instance 1.
        SingletonClass instance1= SingletonClass.getInstance();

        //Instance 2.
        SingletonClass instance2= SingletonClass.getInstance();

        //now lets check the hash key.

        System.out.println("Instance 1 has key: "+instance1.hashCode());
        System.out.println("Instance 2 has key: "+instance2.hashCode());


    }

}
