package com.jbjohn.calendar;

import java.util.Calendar;
import java.util.Date;

/**
 * En VIVO
 */
public class EnVivo {

    public void process(Date matchTime) {

        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        Date scheduleDate;

        if (matchTime.after(date)) {
            long difference = matchTime.getTime() - date.getTime();
            System.out.println(difference);
            long differenceMin = (difference / (60 * 1000));
            if (differenceMin > 20) {
                long schedule = differenceMin - 20;
                cal.add(Calendar.MINUTE, Long.valueOf(schedule).intValue());
                scheduleDate = cal.getTime();
                System.out.println("Schedule alert : " + scheduleDate + ", start in 20");
            } else if (differenceMin > 10) {
                long schedule = differenceMin - 10;
                cal.add(Calendar.MINUTE, Long.valueOf(schedule).intValue());
                scheduleDate = cal.getTime();
                System.out.println("Schedule alert : " + scheduleDate + ", start in 10");
            } else if (differenceMin > 5) {
                long schedule = differenceMin - 5;
                cal.add(Calendar.MINUTE, Long.valueOf(schedule).intValue());
                scheduleDate = cal.getTime();
                System.out.println("Schedule alert : " + scheduleDate + ", start in 5");
            } else {
                System.out.println("Event start soon");
            }
        }
    }
}
