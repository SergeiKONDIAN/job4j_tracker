package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("ks@mail.ru", "Kondian Sergei");
        hashMap.put("ii@mail.ru", "Petr Petrov");
        hashMap.put("pp@mail.ru", "Ivan Ivanov");
        for (String key : hashMap.keySet()) {
            System.out.println(key + " = " + hashMap.get(key));
        }
    }
}