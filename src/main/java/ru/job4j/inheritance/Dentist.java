package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private int toothScore;

    public Dentist(String name, String surname, String education, String birthday, boolean extraCourses, int toothScore) {
        super(name, surname, education, birthday, extraCourses);
        this.toothScore = toothScore;
    }

    public void saysSurgeon() {
        System.out.println("Visit me twice a year.");
    }
}
