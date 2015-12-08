package com.jbjohn.calendar;

import java.util.Date;

/**
 * En VIVO
 */
public class EnVivo {

    public void process(Date matchTime) {

        Date date = new Date();

        if (matchTime.after(date)) {
            long difference = matchTime.getTime() - date.getTime();
            System.out.println(difference);
            long differenceMin = (difference / (60 * 1000));
            if (differenceMin > 20) {
                long schedule = differenceMin - 20;
                System.out.println("Schedule alert : " + schedule + ", start in 20");
            } else if (differenceMin > 10) {
                long schedule = differenceMin - 10;
                System.out.println("Schedule alert : " + schedule + ", start in 10");
            } else if (differenceMin > 5) {
                long schedule = differenceMin - 5;
                System.out.println("Schedule alert : " + schedule + ", start in 5");
            } else {
                System.out.println("Event start soon");
            }
        }
    }
}
