package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax2To1Then() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax9To1Then9() {
        int result = Max.max(9, 1);
        assertThat(result, is (9));
    }
    @Test
    public void whenMax3To0Then3() {
        int result = Max.max(3, 0);
        assertThat(result, is(3));
    }
    @Test
    public void whenMax5To5Then() {
        int result = Max.max(3, 3);
        assertThat(result, is(3));
    }
}