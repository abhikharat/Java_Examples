package com.abhi.java8demos.lambdaex;

interface Drawable{
    public void draw();
}

interface Sayable{
    public String say(String name);
}

interface Addable{
    int add(int a,int b);
}

public class LambdaExpressionExample2 {

  public static void main(String[] args){
        int width=10;

        //Lambda expression with multiple parameters

      Addable add=(a,b)->(a+b);
      System.out.println("Addition of two no is " +add.add(5,10));

      //Lambda expression with multiple parameters with data type

      Addable add1=(int a,int b)->(a+b);
      System.out.println("Addition of two no is " +add1.add(20,10));

      //Lambda expression with return keyword

      Addable add2=(int a,int b)->{
          return  a+b;
      };

      System.out.println("Addition of two no is with return keyword " +add2.add(25,10));

     /* Drawable d2=new Drawable() {
          @Override
          public void draw() {
              System.out.println("Drawable width = "+width);
          }
      };
      d2.draw();*/

       /* Drawable d1=()->{
          System.out.println("Drawable width = "+width);
        };
        d1.draw();*/

//Lambda expression with no parameter
      /*  Sayable s1=()->{
            return "I have nothing to say";
        };
        System.out.println(s1.say());*/


        //Lambda expression with single parameter
       /* Sayable s2=(name)->{
          return "Hello "+name;
        };

        System.out.println(s2.say("Viraj"));*/

        //You can omit function parentheses

    /*  Sayable s3=name->{
          return "Hello "+name;
      };
      System.out.println(s3.say("Abhijeet"));*/


  }
}
