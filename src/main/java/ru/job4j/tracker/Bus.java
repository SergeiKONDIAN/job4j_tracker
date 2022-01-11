package ru.job4j.tracker;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Not so fast!");
    }

    @Override
    public void passangers(int passNum) {
        System.out.println("Maximus bus capacity is " + passNum
        + " passangers.");
    }

    @Override
    public float tank(float fuelVolume) {
        return 50 * fuelVolume;
    }
}
