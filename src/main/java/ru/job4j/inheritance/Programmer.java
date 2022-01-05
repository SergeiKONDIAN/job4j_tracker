package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String lang;

    public Programmer(String lang) {
        super();
        this.lang = lang;
    }

    public void releaseNewProgrammVersion(Programm programm, int version) {
        programm.setVersion(version);
    }
}
