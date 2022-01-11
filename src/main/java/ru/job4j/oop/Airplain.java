package ru.job4j.oop;

public class Airplain implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " flies");
    }
}
