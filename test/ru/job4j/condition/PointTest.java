package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(50, 34);
        Point b = new Point(55, 37);

        double expected = 5.83;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}