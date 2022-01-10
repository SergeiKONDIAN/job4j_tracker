package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 400);
        Book book2 = new Book("Java", 1000);
        Book book3 = new Book("Spring", 450);
        Book book4 = new Book("Hibernate", 800);
        Book[] lib = new Book[4];
        lib[0] = book1;
        lib[1] = book2;
        lib[2] = book3;
        lib[3] = book4;
        for (int index = 0; index < lib.length; index++) {
            Book bk = lib[index];
            System.out.println(bk.getTitle() + " - " + bk.getPageNum());
        }
        System.out.println();
        System.out.println("Repolace Clean code and Spring");
        System.out.println();
        Book change = new Book();
        change = lib[0];
        lib[0] = lib[2];
        lib[2] = change;
        for (int index = 0; index < lib.length; index++) {
            Book bk = lib[index];
            System.out.println(bk.getTitle() + " - " + bk.getPageNum());
        }
        System.out.println();
        for (int i = 0; i < lib.length; i++) {
            Book bk = lib[i];
            if (bk.getTitle().equals("Clean code")) {
                System.out.println(bk.getTitle() + " - " + bk.getPageNum());
            }
        }
    }
}
