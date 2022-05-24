package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double testGetAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        Double result = IntStream.range(0, numbers.length)
                .map(t -> numbers[t])
                .average()
                .orElse(0);

        return result;

    }

}
