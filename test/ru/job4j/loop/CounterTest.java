package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void sum() {
        assertThat((Counter.sum(3, 5)),
                is(12));
    }
}