package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String lang;

    public Programmer(String name, String surname, String education, String birthday, boolean hasTools, String originCountry, String lang) {
        super(name, surname, education, birthday, hasTools);
        this.lang = lang;
    }

    public void releaseNewProgrammVersion(Programm programm, int version) {
        programm.setVersion(version);
    }
}
