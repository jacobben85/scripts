package com.jbjohn.string;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * Test process
 */
public class FormatterTest {

    @Test
    public void testProcess() throws Exception {
        String testString = " http://smb.cdnak.md.neulion.com/u/univisiondeportes/feeds/schedule/${date}.json";
        String format = "YYYY/MM/dd";

        Date date;
        int diff = new Integer("-18");
        Calendar calendar = Calendar.getInstance();
        DateOptions.Options dateOptions = DateOptions.Options.DIFF_DAYS;

        switch (dateOptions) {
            case DIFF_MINUTES:
                calendar.add(Calendar.MINUTE, diff);
                break;
            case DIFF_HOURS:
                calendar.add(Calendar.HOUR, diff);
                break;
            case DIFF_DAYS:
                calendar.add(Calendar.DATE, diff);
                break;
            default:
                break;
        }

        date = calendar.getTime();

        Formatter formatter = new Formatter(date);
        formatter.process(testString, format);
    }
}