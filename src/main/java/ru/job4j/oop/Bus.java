package ru.job4j.oop;

public class Bus implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " goes on road");
    }

    public static void main(String[] args) {
        Vehicle airplain = new Airplain();
        Vehicle train = new Train();
        Vehicle bus = new Bus();

        Vehicle[] vehicles = new Vehicle[]{airplain, train, bus};
        for (Vehicle v : vehicles) {
            v.move();
        }

    }
}
