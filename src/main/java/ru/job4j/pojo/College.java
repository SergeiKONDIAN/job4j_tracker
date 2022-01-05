package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Sergei Kondian");
        student.setGroup("F-13");
        student.setStartDate(new Date());

        System.out.println(student.getName() + " from group " + student.getGroup()
                + " has started his education on " + student.getStartDate());
    }
}
