package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(5, 3, 1);
        assertThat(result, is(5));
    }
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(3, 6, 9);
        assertThat(result, is(9));
    }
    @Test
    public void whenAllEqual() {
        MultiMax check = new MultiMax();
        int result = check.max(5, 5, 5);
        assertThat(result, is(5));
    }
}