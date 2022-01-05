package ru.job4j.inheritance;

public class Diagnosis {

    private String diagnosis;
    private String drugs;

    public Diagnosis() {
    }

    public Diagnosis(String diagnosis, String drugs) {
        this.diagnosis = diagnosis;
        this.drugs = drugs;
    }

    public void setDiagnosis(String diagnosis, String drugs) {
        this.diagnosis = diagnosis;
        this.drugs = drugs;

    }
}
