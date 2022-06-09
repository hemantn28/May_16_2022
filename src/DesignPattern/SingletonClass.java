package DesignPattern;

public class SingletonClass {

    private static volatile SingletonClass sSoleInstance=new SingletonClass();

    //private constructor

    private SingletonClass(){

    }
    public static SingletonClass getInstance(){

        if (sSoleInstance==null){ // if there is no instance available ... create new one.

            sSoleInstance=new SingletonClass();
        }
        return sSoleInstance;
    }
}
