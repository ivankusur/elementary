package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void whenDataMonoWasTrueThenTrue() {
        boolean[] input = new boolean[]{true, true, true};
        boolean result = Check.mono(input);
        boolean expected = true;
        assertThat(expected, is(expected));
    }

    @Test
    public void whenDataMonoWasFalseThenFalse() {
        boolean[] input = new boolean[]{true, false, false, true};
        boolean result = Check.mono(input);
        boolean expected = false;
        assertThat(expected, is(result));
    }

}