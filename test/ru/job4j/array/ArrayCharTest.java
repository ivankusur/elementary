package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ArrayCharTest {

    @Test
    public void startsWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e', 'l'};
        boolean result = ArrayChar.startsWith(word, pref);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void startsWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'i', 'v', 'a', 'n'};
        boolean result = ArrayChar.startsWith(word, pref);
        boolean expected = false;
        assertThat(result, is(expected));
    }
}