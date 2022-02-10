package com.oracle.java8.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Sathiyaraj created on 06-02-2022
 * <p>
 * TODO
 */


public class LambdaExample1 {
    public static void main(String  args[]) {
        List<String> fruits = new ArrayList<String>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("mango");
        fruits.add("orange");

        fruits.stream().forEach(obj -> {
            System.out.println("Fruit name is =>"+ obj);
        });
    }
}
