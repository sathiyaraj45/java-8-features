package com.oracle.java8.collections.list;

import java.util.*;

/**
 * @Author Sathiyaraj created on 14-02-2022
 * <p>
 * TODO
 */


public class StackExample {
    public static void main(String[] args) {
        List<String> books = new Stack<>();
        books.add("Lean In");
        books.add("Java Complete Reference");
        books.add("Multi Threads");
        books.add("Design Principal");

        //Stack List
        System.out.println("Stack List");
        System.out.println(books);

        //Stack Iterator
        System.out.println("List of Books");
        for (String book : books) {
            System.out.println(book);
        }

        //Stack Sort
        Collections.sort(books);
        System.out.println(books);

        //Stack Revers order
        Collections.reverse(books);
        System.out.println(books);

        //Add new book and sorting revers order
        books.add("Design Pattern");
        books.add("Head First Java");
        Collections.sort(books, Collections.reverseOrder());
        System.out.println(books);
    }
}
