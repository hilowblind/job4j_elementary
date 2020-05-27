package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap3to4() {
        int[] input = {5, 7, 9, 1, 0};
        int[] expect = {5, 7, 9, 0, 1};
        int[] result = SwitchArray.swap(input, 3, 4);
        assertThat(result, is(expect));
    }

    @Test
    public void whenSwap2to4() {
        int[] input = {1, 65, 34, 23, 21, 78};
        int[] expect = {1, 65, 21, 23, 34, 78};
        int[] result = SwitchArray.swap(input, 2, 4);
        assertThat(result, is(expect));
    }
}