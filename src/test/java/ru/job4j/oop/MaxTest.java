package ru.job4j.oop;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaxTest {

    @Test
    public void max20() {
        int rls = Max.max(10, 20, -50);
        assertEquals(rls, 20);
    }

    @Test
    public void max30() {
        int rls = Max.max(-30, 30, 30);
        assertEquals(rls, 30);
    }

    @Test
    public void max1000() {
        int rls = Max.max(-30, 30, 30, 1000);
        assertEquals(1000, rls);
    }
}