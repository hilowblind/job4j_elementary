package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expected = 120;  //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
        int result = Factorial.calc(5);
        assertThat(result, is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int expected = 1;  //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
        int result = Factorial.calc(0);
        assertThat(result, is(expected));
    }
}

