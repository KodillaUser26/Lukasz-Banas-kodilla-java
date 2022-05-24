package com.kodilla.stream.array;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {

        //Given
        int [] numbers = new int[] {};

        //When
        double average = ArrayOperations.testGetAverage(numbers);
        System.out.println(average);

        //Then
        assertEquals(0, average,0.1);
    }

}