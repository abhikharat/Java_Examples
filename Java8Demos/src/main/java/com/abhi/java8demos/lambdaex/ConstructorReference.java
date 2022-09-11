package com.abhi.java8demos.lambdaex;

interface Messageable{

    Message getMsg(String msg);

}

class Message{
    Message(String msg){
        System.out.println("msg");
    }
}

public class ConstructorReference {

    public static void main(String[] args) {
        Messageable msg = Message::new;
        msg.getMsg("Hello...");
    }

}
