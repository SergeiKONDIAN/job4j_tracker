package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int middle, int right) {
        return max(max(left, middle), right);
    }

    public static int max(int one, int two, int three, int four) {
        return max(max(one, two, three), four);
    }
}
