package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenFirstMax() {
        assertThat(MultiMax.max(1, 4, 2),
                is(4));
    }

    @Test
    public void whenThirdMax() {
        assertThat(MultiMax.max(23, 25, 30),
                is(30));
    }

    @Test
    public void whenEveryoneEquls() {
        assertThat(MultiMax.max(1, 1, 1),
                is(1));
    }
}