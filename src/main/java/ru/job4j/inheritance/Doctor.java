package ru.job4j.inheritance;

public class Doctor extends Profession {

    private boolean extraCourses;

    public Doctor(String name, String surname, String education, String birthday, boolean extraCourses) {
        super(name, surname, education, birthday);
        this.extraCourses = extraCourses;
    }

    public Diagnosis explorePatient() {
        Diagnosis diagnosis = new Diagnosis();
        return diagnosis;
    }
}
