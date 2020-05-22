package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenPerimeter10k4ThenSquare4() {
        int perimeter = 10;
        int k = 4;
        double expect = 4;
        double out = SqArea.square(perimeter, k);
        Assert.assertEquals(expect, out, 0.0051);
    }

    @Test
    public  void whenPerimeter22k3ThenSquare12() {
        int perimeter = 22;
        int k = 3;
        double expect = 12;
        double out = SqArea.square(perimeter, k);
        Assert.assertEquals(expect, out, 0.0051);
    }
    @Test
    public void whenPerimeter9k3ThenSquare3() {
        int perimeter = 9;
        int k = 3;
        double expect = 3;
        double out = SqArea.square(perimeter, k);
        Assert.assertEquals(expect, out, 0.0051);
    }
}