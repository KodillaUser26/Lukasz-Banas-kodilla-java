package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {

    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> odd = new ArrayList<Integer>();
        if (numbers.isEmpty()) {
            return numbers;
        } else {
            for (Integer no : numbers) {
                if (no % 2 == 0) {
                    odd.add(no);
                }
            }
            return odd;
        }
    }
}