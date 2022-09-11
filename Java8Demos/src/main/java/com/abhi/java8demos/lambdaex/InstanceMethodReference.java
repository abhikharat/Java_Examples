package com.abhi.java8demos.lambdaex;

interface  Sayable4{
    void say();
}
public class InstanceMethodReference {

    public void saySomething(){
        System.out.println("Hello, this is non-static method");
    }

    public static  void main(String[] args){

        //Create instance of InstanceMethodReference class
        InstanceMethodReference obj1=new InstanceMethodReference();
        //Referring non-static method using refernce
        Sayable4 sy=obj1::saySomething;

        //Calling interface method
        sy.say();

        //Referring non-static method using anonymous object
        Sayable4 sy1=new InstanceMethodReference()::saySomething;
        //Calling interface method
        sy1.say();



    }

}
