package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private int toothScore;

    public Dentist(int toothScore) {
        super();
        this.toothScore = toothScore;
    }

    public void saysSurgeon() {
        System.out.println("Visit me twice a year.");
    }
}
