package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        assertThat(Triangle.exist(2.0, 2.0, 2.0),
                is("Triangle Exist"));

    }

    @Test
    public void whenAbsent() {
        assertThat(Triangle.exist(5.5, 2.0, 2.0),
                is("Triangle Absent"));

    }
}