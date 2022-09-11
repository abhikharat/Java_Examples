package com.abhi.java8demos.interfaces;

//Single abstract or functional interface(haveing only one abstract methode in interface known as functional interface)

interface Sayable{
    void say(String msg);  //only one abstract method

    // it can contain any number of object class methode
    int hashCode();
    String toString();
    boolean equals(Object obj);

    //we can not define default method of object class
    /*default boolean equals(Object obj){
        return true;
    }*/
}
public class SingleAbstractInterfaceDemo implements Sayable {

    public static  void main(String[] args){
        SingleAbstractInterfaceDemo obj=new SingleAbstractInterfaceDemo();
        obj.say("Hello ....");
    }

    @Override
    public void say(String msg) {
        System.out.println(msg);
    }
}
