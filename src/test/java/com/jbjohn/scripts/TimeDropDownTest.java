package com.jbjohn.scripts;

import org.junit.Test;

/**
 * Test for time zone drop down
 */
public class TimeDropDownTest {

    @Test
    public void testPrintTimeZones() throws Exception {
        TimeDropDown timeDropDown = new TimeDropDown();
        timeDropDown.printTimeZones();
    }
}