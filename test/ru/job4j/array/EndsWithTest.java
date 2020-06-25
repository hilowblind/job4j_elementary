package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }

    @Test
    public void whenNotEndWithPrefixThenFalseToo() {
        char[] word = {'f', 'a', 't', 'h', 'e', 'r'};
        char[] post = {'h', 'o', 'r'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }

    @Test
    public void whenEndWithPrefixThenTrueToo() {
        char[] word = {'n', 'i', 'g', 'h', 't'};
        char[] post = {'h', 't'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }
}