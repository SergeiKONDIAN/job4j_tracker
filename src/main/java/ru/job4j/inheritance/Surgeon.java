package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private boolean plasticSurgery;

    public Surgeon(boolean plasticSurgery) {
        super();
        this.plasticSurgery = plasticSurgery;
    }

    public void saysSurgeon() {
        System.out.println("I can fix your nose.");
    }
}
