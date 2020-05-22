package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenX1Y2X3Y4Then2And83() {
        int x1 = 1;
        int y1 = 2;
        int x2 = 3;
        int y2 = 4;
        double expected = 2.83;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.0051);
    }
    @Test
    public void whenX5Y7X8Y9Then3and61() {
        int x1 = 5;
        int y1 = 7;
        int x2 = 8;
        int y2 = 9;
        double expected = 3.61;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.0051);
    }
}