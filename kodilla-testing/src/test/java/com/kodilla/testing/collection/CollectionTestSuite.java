package com.kodilla.testing.collection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        ArrayList<Integer> emptyList = new ArrayList<Integer>();

        ArrayList<Integer> listNumbers = OddNumbersExterminator.exterminate(emptyList);
        System.out.println(listNumbers);

        assertEquals(emptyList, listNumbers);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        ArrayList<Integer> oddList = new ArrayList<>(Arrays.asList(2, 4, 6));

        ArrayList<Integer> listNumbers = OddNumbersExterminator.exterminate(list);
        System.out.println(listNumbers);

        assertEquals(oddList, listNumbers);
    }
}