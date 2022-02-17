package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ItemsSortByNameTest {

    @Test
    public void whenSortAsc() {
        Item item1 = new Item(1, "Serg");
        Item item2 = new Item(2, "Anna");
        Item item3 = new Item(3, "Petr");
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = new ArrayList<>();
        expected.add(item2);
        expected.add(item3);
        expected.add(item1);
        assertEquals(items, expected);
    }

    @Test
    public void whenSortDesc() {
        Item item1 = new Item(1, "Serg");
        Item item2 = new Item(2, "Anna");
        Item item3 = new Item(3, "Petr");
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = new ArrayList<>();
        expected.add(item1);
        expected.add(item3);
        expected.add(item2);
        assertEquals(items, expected);
    }
}