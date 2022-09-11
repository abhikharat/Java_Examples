package com.abhi.java8demos.lambdaex;

import java.util.function.BiFunction;

interface Sayable2{
    void say();
}

class Arithmetic{
    public static int add(int a,int b){
        return a+b;
    }

    public static float add(int a,float b){
        return a+b;
    }
    public static float add(float a,int b){
        return a+b;
    }
}


public class StaticMethodReference {

    private static void saySomething(){
        System.out.println("Hello, this is a static method");
    }

    public static void ThreadStatus(){
        System.out.println("Thread is running");
    }


    public static void main(String[] args){
        Sayable2 say=StaticMethodReference::saySomething;
        say.say();

        // define predefine functional interface Runnable to refer static method
        Thread t1=new Thread(StaticMethodReference::ThreadStatus);
        t1.start();

        BiFunction<Integer,Integer,Integer> a=Arithmetic::add;
        int result=a.apply(10,5);

        System.out.println("Addition of two number result = "+result);

        //override static method by referring methods

        BiFunction<Integer,Float,Float> a2=Arithmetic::add;
        float result2=a2.apply(10,5.01f);
        System.out.println("Addition of two number result2 = "+result2);

        BiFunction<Float,Integer,Float> a3=Arithmetic::add;
        float result3=a3.apply(20.00f,5);

        System.out.println("Addition of two number result3 = "+result3);

    }
}

