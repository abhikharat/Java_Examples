package com.abhi.java8demos.lambdaex;

import java.util.ArrayList;
import java.util.List;

//Lambda expression example of forEach loop
public class LambdaExpressionExample7 {

    public static void main(String[] args){

        List<String> list=new ArrayList<String>();
        list.add("Viraj");
        list.add("Pranali");
        list.add("Abhijeet");

        list.forEach((name)->{
            System.out.println(name);
        });
    }
}
