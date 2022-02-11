package com.oracle.java8.sort;

import java.sql.SQLOutput;
import java.util.*;

/**
 * @Author Sathiyaraj created on 11-02-2022
 * <p>
 * TODO
 */


public class SortWithMapLambda {
    public static void main(String[] args) {
        Map<Integer, Country> countries = new HashMap<>();
        countries.put(new Country(1, "IN", "India", "Rupees").hashCode(),
                new Country(1, "IN", "India", "Rupees"));
        countries.put(new Country(2, "SL","Srilankha","Rupees").hashCode(),
                new Country(2, "SL","Srilankha","Rupees"));
        countries.put(new Country(3, "RK", "Paskitan", "Rupees").hashCode(),
                new Country(3, "RK", "Paskitan", "Rupees"));
        countries.put(new Country(5, "UE", "United Arub Emirates", "Dhiram").hashCode(),
                new Country(5, "UE", "United Arub Emirates", "Dhiram"));
        countries.put(new Country(6, "UK", "United Kingdom", "Dollar").hashCode(),
                new Country(6, "UK", "United Kingdom", "Dollar"));

        System.out.println("*****************************");
        System.out.println("Hash map list");
        System.out.println(countries);

        List<Map.Entry<Integer, Country>> entries = new ArrayList<>(countries.entrySet());

        //Traditional way sorting
        Collections.sort(entries, new Comparator<Map.Entry<Integer, Country>>() {
            @Override
            public int compare(Map.Entry<Integer, Country> o1, Map.Entry<Integer, Country> o2) {
                return o1.getKey() - o2.getKey();
            }
        });

        System.out.println("***********************");
        System.out.println("Sorted map");
        System.out.println(entries);

        //Sorting lambda
        Collections.sort(entries, (country1, country2) -> country2.getValue().getCountryName().compareTo(country1.getValue().getCountryName()));
        System.out.println("***********************");
        System.out.println("Sorted map");
        System.out.println(entries);

        //Sorting with stream API
        System.out.println("***********************");
        System.out.println("Sorted map");
        countries.entrySet().stream().sorted((country1, country2) -> country1.getValue().getCountryName().compareTo(country2.getValue().getCountryName())).forEach(
                obj -> System.out.println(obj)
        );


        // Alter way key sorting with stream API
        System.out.println("***********************");
        System.out.println("Sorted map");
        countries.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(
                obj -> System.out.println(obj)
        );

        // Alter way key sorting with stream API
        System.out.println("***********************");
        System.out.println("Sorted map");
        countries.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Country::getCountryName))).forEach(
                System.out::println
        );
    }
}
