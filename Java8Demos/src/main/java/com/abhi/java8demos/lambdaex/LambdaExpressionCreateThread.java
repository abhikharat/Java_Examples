package com.abhi.java8demos.lambdaex;

public class LambdaExpressionCreateThread {

    public static void main(String[] args){

        //Without lambda expression

        Runnable r1=new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread-1 is running");
            }
        };

        Thread t1=new Thread(r1);
        t1.start();


        //Creating thread with lambda expression

        Runnable r2=()->System.out.println("Thread-2 is running");

        Thread t2=new Thread(r2);
        t2.start();

    }
}
