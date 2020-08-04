package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenEndsPrefEqualPostThenTrue() {
        char[] word = {'i', 'v', 'a', 'n', '1', '9', '9', '0'};
        char[] post =  {'n', '1', '9', '9', '0'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenEndsPrefUnequalPostThenFalse() {
        char[] word = {'i', 'v', 'a', 'n', '1', '9', '9', '0'};
        char[] post =  {'1', '8', '9', '0'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
}