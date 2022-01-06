package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private boolean plasticSurgery;

    public Surgeon(String name, String surname, String education, String birthday, boolean extraCourses, boolean plasticSurgery) {
        super(name, surname, education, birthday, extraCourses);
        this.plasticSurgery = plasticSurgery;
    }

    public void saysSurgeon() {
        System.out.println("I can fix your nose.");
    }
}
