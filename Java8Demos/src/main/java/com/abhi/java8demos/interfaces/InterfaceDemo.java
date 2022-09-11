package com.abhi.java8demos.interfaces;


interface Messageble{

    default void show(){
        System.out.println("Hello...Messageble");
    }
}

interface Messageble2{
    default void show1(){
        System.out.println("Hello...Messageble1");
    }
}

public class InterfaceDemo implements Messageble,Messageble2{

    public static void main(String[] args){
        InterfaceDemo obj=new InterfaceDemo();
        obj.show();
        obj.show1();
    }

   /* @Override
    public void show() {
        System.out.println("Hello...");
    }*/
}
