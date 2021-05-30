package com.tms.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task_0 {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        Random r = new Random();
        for(int i = 0; i < 10; i++){
            myCollection.add(r.nextInt(20));
        }
        System.out.println("Initial collection:\n" + myCollection);

        Supplier<Stream<Integer>> myStream = myCollection::stream;

        System.out.println("Duplicates removed: \n" + myStream.get()
                .distinct()
                .collect(Collectors.toList()));
        System.out.println("Even elements from 7 to 17 (if any): \n" + myStream.get()
                .filter(n -> n > 7 && n < 17)
                .filter(n -> n %2 == 0)
                .collect(Collectors.toList()));
        System.out.println("Each element multiplied: \n" + myStream.get()
                .map(n -> n*2)
                .collect(Collectors.toList()));
        System.out.println("First 4 elements of sorted initial sequence: \n" + myStream.get()
                .sorted()
                .limit(4)
                .collect(Collectors.toList()));
        System.out.println("Number of elements in the stream: " + myStream.get().count());
        System.out.println("Average of the elements: " + myStream.get().mapToInt(Integer::intValue).average());
    }
}
