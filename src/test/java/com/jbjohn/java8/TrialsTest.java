package com.jbjohn.java8;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Trials tests
 */
public class TrialsTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testListTrials() throws Exception {
        Trials trials = new Trials();
        trials.ListTrials();
    }
}