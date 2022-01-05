package ru.job4j.oop;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance5() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 4);
        double rls = a.distance(b);
        assertEquals(rls, 5.0, 0.01);
    }

    @Test
    public void distance16Point64() {
        Point a = new Point(1, 1);
        Point b = new Point(10, 15);
        double rls = a.distance(b);
        assertEquals(rls, 16.64, 0.01);
    }
}