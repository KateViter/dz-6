package org.example;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        cities.add("London");
        cities.add("Lviv");
        cities.add("New York");
        cities.add("Lviv");

        String anotherCity = "Lviv";

        //перевірка на наявність певного елементу в масиві
        System.out.println(checkCity(cities,anotherCity));

        //виведення масиву без дублікатів
        HashSet<String> uniqueCities = deleteDuplicates(cities);
        System.out.println(uniqueCities);


    }

    // функція для пошуку певного елементу масиву
    public static boolean checkCity(ArrayList<String> cities, String city) {
        for (String someCity : cities) {
            if (someCity.equals(city)) {return true;}
        }
        return false;
    }

    // функція для видалення дублікатів з масиву
    public static HashSet deleteDuplicates(ArrayList<String> cities) {
        HashSet<String> duplicates = new HashSet<>();
        for (int i = 0; i < cities.size(); i++){
            duplicates.add(cities.get(i));
        }
        return duplicates;
    }

}