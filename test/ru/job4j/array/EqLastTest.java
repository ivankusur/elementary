package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EqLastTest {

    @Test
    public void whenEndLeftEqualsEndRightThenCheckTrue() {
        int[] left = {1, 2, 3};
        int[] right = {9, 6, 3};
        boolean result = EqLast.check(left, right);
        assertThat(result, is(true));
    }

    @Test
    public void whenEndLefUnequalEndRightThenCheckFalse() {
        int[] left = {1, 2, 3};
        int[] right = {3, 2, 1};
        boolean result = EqLast.check(left, right);
        assertThat(result, is(false));
    }
}