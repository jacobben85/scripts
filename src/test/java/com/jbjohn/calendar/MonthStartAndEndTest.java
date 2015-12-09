package com.jbjohn.calendar;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;


/**
 * Start and end test
 */
public class MonthStartAndEndTest {

    @Before
    public void setUp() throws Exception {
        try {
            String monthParam = "2";
            String yearParam = "2015";
            Integer tzOffset = 5;

            if (tzOffset == null || tzOffset < -12 || tzOffset > 14) {
                DateTime now = new DateTime();
                tzOffset = now.getZone().getOffset(now) / 1000 / 60 / 60;
                if (tzOffset < -12 || tzOffset > 14) {
                    System.out.println("Invalid timezone in request: " + tzOffset);
                }
            }
            DateTimeZone timezone = DateTimeZone.forOffsetHours(tzOffset);

            // Create a new date time stamp based on the month, year and optional time zone provided.
            DateTime monthStart = new DateTime(Integer.parseInt(yearParam), Integer.parseInt(monthParam), 1, 0, 0, timezone);

            // Bind the query by the month start.
            System.out.println(monthStart);

            // Find the last day of the month and bind the query by that date.
            DateTime monthEnd = monthStart.dayOfMonth().withMaximumValue();
            monthEnd = monthEnd.plusDays(1).minusMillis(1);
            System.out.println(monthEnd);

        } catch (NumberFormatException e) {
            throw new InvalidParameterException("Year and Month must be in integers.");
        }
    }

    @Test
    public void testProcess() throws Exception {
        MonthStartAndEnd startAndEnd = new MonthStartAndEnd();
        startAndEnd.process();
    }
}