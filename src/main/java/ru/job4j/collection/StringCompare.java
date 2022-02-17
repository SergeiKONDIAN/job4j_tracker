package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int n = Math.min(left.length(), right.length());
        for (int i = 0; i < n; i++) {
            char charL = left.charAt(i);
            char charR = right.charAt(i);
            int rsl = Character.compare(charL, charR);
            if (rsl != 0) {
                return rsl;
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}