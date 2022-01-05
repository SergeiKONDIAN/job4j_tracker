package ru.job4j.inheritance;

public class Doctor extends Profession {

    private boolean extraCourses;

    public Doctor() {
        }

    public Doctor(boolean extraCourses) {
        super();
        this.extraCourses = extraCourses;
    }

    public Diagnosis explorePatient() {
        Diagnosis diagnosis = new Diagnosis();
        return diagnosis;
    }
}
