package ru.job4j.inheritance;

public class Project {

    private boolean aprovedStatus;
    private int duration;

    public Project() {
    }

    public Project(boolean aprovedStatus, int duration) {
        this.aprovedStatus = aprovedStatus;
        this.duration = duration;
    }

    public void setAprovedStatus() {
        aprovedStatus = true;
    }
}
