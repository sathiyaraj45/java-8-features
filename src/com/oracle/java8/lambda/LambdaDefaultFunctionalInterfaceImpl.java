package com.oracle.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author Sathiyaraj created on 10-02-2022
 * <p>
 * TODO
 */


public class LambdaDefaultFunctionalInterfaceImpl {
    public static void main(String args[]) {
        List<String> fruits = Arrays.asList("apple", "orange", "mango", "kiwi", "banana", "pineapple", "lemon");
        //New lambda implementation for FunctionalInterface on comparator
        fruits.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(fruits);

        //Comparator implementation traditional way
        Comparator<? super String> myComparator = null;
        fruits.sort(myComparator);
        Collections.sort(fruits, Collections.reverseOrder());
        System.out.println(fruits);


    }
}

class MyComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}


