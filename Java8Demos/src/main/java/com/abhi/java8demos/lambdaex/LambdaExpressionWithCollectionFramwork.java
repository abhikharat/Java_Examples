package com.abhi.java8demos.lambdaex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Product{
    int id;
    String name;
    float price;
    Product(int id,String name,float price){
        super();
        this.id=id;
        this.name=name;
        this.price=price;
    }
}

public class LambdaExpressionWithCollectionFramwork {

    public static void main(String[] args){

        List<Product> list=new ArrayList<>();
        list.add(new Product(1,"Samsung A5",17000f));
        list.add(new Product(3,"Iphone 6S",65000f));
        list.add(new Product(2,"Sony Xperia",25000f));
        list.add(new Product(4,"Nokia Lumia",15000f));
        list.add(new Product(5,"Redmi4 ",26000f));
        list.add(new Product(6,"Lenevo Vibe",19000f));


/*
        Collections.sort(list,(p1,p2)->{
            return  p1.name.compareTo(p2.name);
        });

        for(Product p2:list){
            System.out.println(p2.id+" , "+p2.name+" , "+p2.price);
        }*/

        //Lambda expression to filter data

        Stream<Product> filteredList =list.stream().filter(p->p.price!=17000);

        filteredList.forEach(product -> System.out.println(product.id+" , "+product.name+" , "+product.price));

    }
}
