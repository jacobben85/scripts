package com.jbjohn.string;

import org.junit.Test;

/**
 * Test process
 */
public class FormatterTest {

    @Test
    public void testProcess() throws Exception {
        String testString = " http://smb.cdnak.md.neulion.com/u/univisiondeportes/feeds/schedule/${date}.json";
        String format = "YYYY/MM/dd";

        Formatter formatter = new Formatter();
        formatter.process(testString, format);
    }
}