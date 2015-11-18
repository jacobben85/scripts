package com.jbjohn.calendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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
    }
}
