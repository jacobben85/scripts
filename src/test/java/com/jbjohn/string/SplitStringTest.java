package com.jbjohn.string;

import junit.framework.Assert;
import org.junit.Test;

/**
 * String split tests
 */
public class SplitStringTest {
    @Test
    public void process() throws Exception {
        SplitString splitString = new SplitString();
        boolean flag = splitString.process();

        Assert.assertEquals(flag, true);
    }
}