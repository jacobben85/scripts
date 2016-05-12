package com.jbjohn.java8;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Trials tests
 */
public class TrialsTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testListTrials() throws Exception {
        boolean expected = true;

        Trials trials = new Trials();
        boolean response = trials.ListTrials();

        Assert.assertEquals(expected, response);
    }
}