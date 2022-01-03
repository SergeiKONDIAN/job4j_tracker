package ru.job4j.oop;

public class Calculator {

    private final static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return x - y;
    }

    public int multiply(int y) {
        return x * y;
    }

    public double divide(int y) {
        return (double) y / (double) x;
    }

    public double sumAllOperation(int y) {
        return sum(y) + minus(y) + multiply(y) + divide(y);
    }

    public static void main(String[] args) {
        int result = minus(5);
        System.out.println(result);

        Calculator calculator = new Calculator();

        double resultDivision = calculator.divide(5);
        System.out.println(resultDivision);

        double resultAll = calculator.sumAllOperation(10);
        System.out.println(resultAll);
    }
}
