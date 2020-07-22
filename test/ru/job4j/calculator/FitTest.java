package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenHeight177ThanManWaight8855() {
        double in = 177.0;
        double expected = 88.55;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenHeight167ThanWomanWeight6555() {
        double in = 167;
        double expected = 65.55;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}