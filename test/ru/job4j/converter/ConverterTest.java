package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        int in = 180;
        int expected = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert700RblThen10Euro() {
        int in = 700;
        int expected = 10;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert700RblThen11Dollars() {
        int in = 700;
        int expected = 11;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}