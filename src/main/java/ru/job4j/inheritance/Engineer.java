package ru.job4j.inheritance;

public class Engineer extends Profession {

    private boolean hasTools;

    public Engineer() {
    }

    public Engineer(boolean hasTools) {
        super();
        this.hasTools = hasTools;
    }

    public void aprovesProject(Project project) {
        project.setAprovedStatus();
    }
}
