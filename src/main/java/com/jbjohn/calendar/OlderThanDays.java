package com.jbjohn.calendar;

import java.util.Date;
import org.apache.commons.lang.time.DateUtils;
import org.joda.time.DateTime;

/**
 * Older than a number of days
 */
public class OlderThanDays {

    public void getDateTime() {
        Date date = DateUtils.addMinutes(new Date(), -5);

        Date dateStart = new DateTime(DateUtils.addDays(date, -10))
                .hourOfDay().withMinimumValue()
                .minuteOfDay().withMinimumValue()
                .secondOfMinute().withMinimumValue()
                .millisOfSecond().withMinimumValue().toDate();

        System.out.println(dateStart);
    }

}
