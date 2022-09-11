package com.abhi.java8demos.stream;

import sun.awt.geom.AreaOp;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product{
     int id;
     String name;
     float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


}

public class JavaStreamExample {

    //Create List of Product class
    static List<Product> pList=new ArrayList<>();



    public static void main(String args[]){

        //Adding Product in list
        pList.add(new Product(1,"HP Laptop",25000f));
        pList.add(new Product(2,"Dell Laptop",30000f));
        pList.add(new Product(3,"Lenevo Laptop",28000f));
        pList.add(new Product(4,"Sony Laptop",28000f));
        pList.add(new Product(5,"Apple Laptop",90000f));

        //Stream example of number iterator
        //stringIterator();

        //Stream example with list
        //streamListExample();

        //Stream with reduce method
        //reduceMethod();

        // Using Collectors's method to sum the prices.
        //sumCollectore();

        //find max and min product price
        FindMinMaxProductPrice();

    }

    private static void FindMinMaxProductPrice() {

        // finding max product price
        Product product=pList.stream()
                .max((product1,product2)->product1.price>product1.price?1:-1).get();

        System.out.println("Max product : "+product.price);

        //finding min product price

        Product productMin=pList.stream()
                .min((product1,product2)->product1.price>product2.price?1:-1).get();

        System.out.println("Min Product Price : "+productMin.price);

        //Count number of product based on the filter

        Long count=pList.stream()
                .filter(product4->product4.price>30000)
                .count();

        System.out.println("Count of product based on filter : "+count);

        //Convert List into set to  remove duplicate elements
        Set<Float> setOfPrice=pList.stream()
                .map(product5 -> product5.price)
                .collect(Collectors.toSet());

        System.out.println(setOfPrice);



    }



    private static void sumCollectore() {

        Double price=pList.stream()
                .collect(Collectors.summingDouble(product->product.price));

        System.out.println(price);
    }

    private static void reduceMethod() {
        // This is more compact approach for filtering data
       Float totalPrice= pList.stream()
                .map(product -> product.price)
                .reduce(0.0f,(sum,price)->sum+price); //accumulating price

        System.out.println("Total Price : "+totalPrice);

        //more Precise code

        Float totalPrice2=pList.stream()
                .map(product -> product.price)
                .reduce(0.0f,Float::sum);

        System.out.println("Total Price-2 : "+totalPrice2);


    }

    private static void stringIterator() {

        Stream.iterate(1,element->element+1)
                .filter(element->element%5==0)
                .limit(5)
                .forEach(System.out::println);
    }


    private static void streamListExample(){


        //We are creating list of only price
        List<Float> priceList=new ArrayList<>();

        priceList= pList.stream()
                .filter(p->p.price<=30000) //filtering data
                .map(p->p.price)//Fetching price
                .collect(Collectors.toList());//collecting as list

        System.out.println(priceList);

        //filtering and iterating

        pList.stream()
                .filter(product->product.price==30000)
                .forEach(product -> System.out.println(product.name));
    }
}
