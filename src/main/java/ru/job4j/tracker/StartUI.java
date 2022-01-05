package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {

        Item item = new Item();
        LocalDateTime date = item.getCreationDate();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-EEEE-yyyy HH:mm:ss");
        String dateFormated = date.format(formatter);
        System.out.println(dateFormated);
    }
}
