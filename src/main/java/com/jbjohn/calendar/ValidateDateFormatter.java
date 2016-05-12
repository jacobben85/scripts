package com.jbjohn.calendar;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;

/**
 * date formatter validation
 */
public class ValidateDateFormatter {

    private static DateTimeFormatter formatter;

    public ValidateDateFormatter() {
        formatter = new DateTimeFormatterBuilder()
                .appendYear(4, 4)
                .appendMonthOfYear(2)
                .appendDayOfMonth(2)
                .appendHourOfDay(2)
                .appendMinuteOfHour(2)
                .appendSecondOfMinute(2)
                .toFormatter();
    }

    public void setFormatter(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    public void validate(String date) {
        System.out.println(DateTime.parse(date, formatter));
    }
}
