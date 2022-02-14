package com.oracle.java8.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Sathiyaraj created on 14-02-2022
 * <p>
 * TODO
 */


public class ArrayListExample {
    public static void main(String[] args) {
        List<String> computerAccessories = new ArrayList<String>();
        computerAccessories.add("Monitor");
        computerAccessories.add("Printer");
        computerAccessories.add("CPU");
        computerAccessories.add("Mouse");
        computerAccessories.add("Scanner");
        computerAccessories.add("Keyboard");
        //Index based add
        computerAccessories.add(2,"Drawing Pad");

        //Add bulk list
        computerAccessories.addAll(Arrays.asList("Speaker", "Mic", "Projector", "Webcam"));

        //Add null value
        computerAccessories.add(null);
        computerAccessories.add(null);

        System.out.println("Computer Accessories List");
        System.out.println(computerAccessories);

        //Index of elements
        System.out.println(computerAccessories.indexOf(null));
        //Last Index of
        System.out.println(computerAccessories.lastIndexOf(null));
    }
}
