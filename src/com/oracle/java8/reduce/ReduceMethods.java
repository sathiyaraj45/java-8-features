package com.oracle.java8.reduce;

import java.util.Arrays;
import java.util.List;

/**
 * @Author Sathiyaraj created on 12-02-2022
 * <p>
 * TODO
 */


public class ReduceMethods {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,3,5,6,8,4,7,11);
        int max = numbers.stream()
                .reduce((a, b)->a>b?a:b).orElse(0);
        
        System.out.println(max);
    }
}
