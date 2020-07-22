package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax10To5Then10() {
        assertThat(Max.max(10, 5), is(10));
    }

    @Test
    public void whenMax7To15Then15() {
        assertThat(Max.max(7, 15), is(15));
    }

    @Test
    public void whenMax5To5ThenUnknown() {
        assertThat(Max.max(5, 5), is(5));
    }
}