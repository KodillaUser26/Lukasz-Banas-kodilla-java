package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {

    public static List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> odd = new ArrayList<>();
        for (Integer no : numbers) {
            if (no % 2 == 0) {
                odd.add(no);
            }
        }
        return odd;
    }
}