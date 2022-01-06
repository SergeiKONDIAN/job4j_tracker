package ru.job4j.inheritance;

public class Engineer extends Profession {

    private boolean hasTools;

    public Engineer(String name, String surname, String education, String birthday, boolean hasTools) {
        super(name, surname, education, birthday);
        this.hasTools = hasTools;
    }

    public void aprovesProject(Project project) {
        project.setAprovedStatus();
    }
}
