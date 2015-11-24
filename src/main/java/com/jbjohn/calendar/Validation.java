package com.jbjohn.calendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.joda.time.DateTime;

/**
 * Validating calendar
 */
public class Validation {

    public void process() {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar now = Calendar.getInstance();

        String tsCreated = formatter.format(now.getTimeInMillis());
        System.out.println(tsCreated);

        now.add(Calendar.MINUTE, 10080);

        String tsExpire = formatter.format(now.getTimeInMillis());
        System.out.println(tsExpire);

        int delayHours = -13;

        DateTime today = getStartDate(delayHours);
        DateTime tomorrow = getEndDate(delayHours);

        System.out.println(new DateTime());
        System.out.println(new DateTime().withTimeAtStartOfDay());
        System.out.println(today);
        System.out.println(tomorrow);
    }

    private DateTime getStartDate(int delayHours) {
        DateTime today = new DateTime();

        if (delayHours >= 0) {
            today = today.minusHours(delayHours);
        }

        today = today.withTimeAtStartOfDay();

        if (delayHours >= 0) {
            today = today.plusHours(delayHours);
        } else {
            today = today.minusHours(0 - delayHours);
        }

        return today;
    }

    private DateTime getEndDate(int delayHours) {
        DateTime today = getStartDate(delayHours);

        DateTime tomorrow = today.plusDays(1);
        return tomorrow;
    }
}
