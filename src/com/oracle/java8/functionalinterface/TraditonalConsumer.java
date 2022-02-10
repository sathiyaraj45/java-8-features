package com.oracle.java8.functionalinterface;

import java.util.function.Consumer;

/**
 * @Author Sathiyaraj created on 10-02-2022
 * <p>
 * TODO
 */


public class TraditonalConsumer implements Consumer<String> {
     public static void main(String args[]) {
         TraditonalConsumer traditonalConsumer = new TraditonalConsumer();
         traditonalConsumer.accept("sathiya");
     }

    @Override
    public void accept(String s) {
        System.out.println("Hello "+ s);
    }
}
