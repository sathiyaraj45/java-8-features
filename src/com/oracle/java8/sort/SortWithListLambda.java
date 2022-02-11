package com.oracle.java8.sort;

import java.util.*;

/**
 * @Author Sathiyaraj created on 11-02-2022
 * <p>
 * TODO
 */


public class SortWithListLambda {
    public static void main(String args[]) {
        List<Country> countries = new ArrayList<Country>();
        countries.add(new Country(1, "IN", "India", "Rupees"));
        countries.add(new Country(2, "SL","Srilankha","Rupees"));
        countries.add(new Country(3, "RK", "Paskitan", "Rupees"));
        countries.add(new Country(4,"NP", "Nepal", "Rupees"));
        countries.add(new Country(5, "UE", "United Arub Emirates", "Dhiram"));
        countries.add(new Country(6, "UK", "United Kingdom", "Dollar"));

        //Traditional Sorting
        Collections.sort(countries, new myComparatorByCountryCode());
        System.out.println(countries);

        //Traditional Revers Sorting
        Collections.sort(countries, new myComparatorByCountryCode().reversed());
        System.out.println(countries);

        //Traditional Revers Sorting
        Collections.reverseOrder(new myComparatorByCountryCode().reversed());
        System.out.println(countries);

        //Traditional sort inline
        Collections.sort(countries, new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return o1.getCountryCode().compareTo(o2.getCountryCode());
            }
        });
        System.out.println(countries);

        //Traditional sort inline
        Collections.sort(countries, new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return o2.getCountryCode().compareTo(o1.getCountryCode());
            }
        });
        System.out.println(countries);

        //Sorting the countries using lambda
        System.out.println("Sort the country using lambda expression");
        countries.stream().sorted((country1, country2) -> country1.getCountryCode().compareTo(country2.getCountryCode())).forEach(
                country -> System.out.println(country)
        );

        //Sorting the countries using lambda
        System.out.println("Sort revers order the country using lambda expression");
        countries.stream().sorted((country1, country2) -> country2.getCountryCode().compareTo(country1.getCountryCode())).forEach(
                country -> System.out.println(country)
        );

    }
}

class myComparatorByCountryCode implements Comparator<Country>
{

    @Override
    public int compare(Country o1, Country o2) {
        final int i = o1.getCountryCode().compareTo(o2.getCountryCode());
        return i;
    }

    @Override
    public Comparator<Country> reversed() {
        return Comparator.super.reversed();
    }
}

class Country {
    private int id;
    private String countryCode;
    private String countryName;
    private String countryValue;

    public Country(int id, String countryCode, String countryName, String countryValue) {
        this.id = id;
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.countryValue = countryValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return id == country.id && Objects.equals(countryCode, country.countryCode) && Objects.equals(countryName, country.countryName) && Objects.equals(countryValue, country.countryValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, countryCode, countryName, countryValue);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        countryName = countryName;
    }

    public String getCountryValue() {
        return countryValue;
    }

    public void setCountryValue(String countryValue) {
        this.countryValue = countryValue;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", countryCode='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                ", countryValue='" + countryValue + '\'' +
                '}';
    }
}
