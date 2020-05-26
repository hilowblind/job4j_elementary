package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas10Then2() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {4, 2, 10, 56, 43};
        int value = 10;
        int result = find.indexOf(input, value);
        int expect = 2;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas6ThenMinus1() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {1, 5, 7, 2};
        int value = 6;
        int result = find.indexOf(input, value);
        int expected = -1;
        assertThat(result, is(expected));
    }
}