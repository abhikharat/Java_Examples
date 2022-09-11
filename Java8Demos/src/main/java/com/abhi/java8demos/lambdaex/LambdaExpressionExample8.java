package com.abhi.java8demos.lambdaex;

@FunctionalInterface
interface Sayable1{
    String say(String message);
}

//Example of multiple statement in lambda expression
public class LambdaExpressionExample8 {

    public static void main(String[] args) {


    Sayable1 say = message -> {
        String str1 = "I would like to say";
        String str2 = str1 + message;
        return str2;
    };

    System.out.println(say.say("Time is precious"));
}
}
