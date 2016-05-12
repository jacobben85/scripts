package com.jbjohn.calendar;

import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.junit.Test;

/**
 */
public class ValidateDateFormatterTest {
    String date = "20160417035904+0000";

    @Test
    public void testFormatting() throws Exception {
        DateTimeFormatter dateTimeFormatter = new DateTimeFormatterBuilder()
                .appendYear(4, 4)
                .appendMonthOfYear(2)
                .appendDayOfMonth(2)
                .appendHourOfDay(2)
                .appendMinuteOfHour(2)
                .appendSecondOfMinute(2)
                .appendTimeZoneOffset("Z", false, 2, 4)
                .toFormatter();
        ValidateDateFormatter formatter = new ValidateDateFormatter();
        formatter.setFormatter(dateTimeFormatter);
        formatter.validate(date);
    }
}