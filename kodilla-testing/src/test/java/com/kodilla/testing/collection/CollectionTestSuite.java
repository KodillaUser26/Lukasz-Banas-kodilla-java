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
        //given
        List<Integer> emptyList = new ArrayList<>();
        //when
        List<Integer> listNumbers = OddNumbersExterminator.exterminate(emptyList);
        //then
        assertEquals(emptyList, listNumbers);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //given
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        //when
        List<Integer> listNumbers = OddNumbersExterminator.exterminate(list);
        //then
        List<Integer> evenList = new ArrayList<>(Arrays.asList(2, 4, 6));
        assertEquals(evenList, listNumbers);
    }
}