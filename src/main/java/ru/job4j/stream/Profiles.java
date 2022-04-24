package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public static List<Address> collect(List<Profile> profiles) {
        List<Address> rsl = profiles.stream()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
        return rsl;
    }

    public static List<Address> collectSortWithoutDuplicate(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .sorted((address1, address2) -> address1.getCity().compareTo(address2.getCity()))
                .distinct()
                .collect(Collectors.toList());
    }
}