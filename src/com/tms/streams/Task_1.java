package com.tms.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task_1 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Anatolii");
        myList.add("Vitaliy");
        myList.add("Maria");
        myList.add("Julia");
        myList.add("Egor");
        myList.add("Tasja");
        myList.add("Aina");
        myList.add("Svetlana");
        myList.add("aleksander");
        myList.add("Evgenii");
        myList.add("Vitaliy");
        myList.add("Maria");
        myList.add("Lera");
        myList.add("Katharina");
        myList.add("OLGA");

        Supplier<Stream<String>> myStream = myList::stream;

        System.out.println("Number of people with my name: " + myStream.get().filter(str -> str.equalsIgnoreCase("Olga")).count());
        Predicate<String> isStartsWithA = str -> str.startsWith("a") || str.startsWith("A");
        System.out.println("Names starting with 'a' (ignore case): \n" + myStream.get().filter(isStartsWithA).collect(Collectors.toList()));

        Optional<String> first = myStream.get().sorted().findFirst();
        System.out.println("First element: " + first);



    }
}
