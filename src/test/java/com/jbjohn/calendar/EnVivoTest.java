package com.jbjohn.calendar;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * En vivo tests
 */
public class EnVivoTest {

    EnVivo enVivo;

    @Before
    public void setUp() throws Exception {
        enVivo = new EnVivo();
    }

    @Test
    public void testProcessOneHour() throws Exception {

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR, 1);
        Date oneHourAhead = cal.getTime();

        enVivo.process(oneHourAhead);
    }

    @Test
    public void testProcessThirtyMin() throws Exception {

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MINUTE, 30);
        Date oneHourAhead = cal.getTime();

        enVivo.process(oneHourAhead);
    }

    @Test
    public void testProcessTwentyOneMin() throws Exception {

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MINUTE, 21);
        Date oneHourAhead = cal.getTime();

        enVivo.process(oneHourAhead);
    }

    @Test
    public void testProcessTwentyMin() throws Exception {

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MINUTE, 20);
        Date oneHourAhead = cal.getTime();

        enVivo.process(oneHourAhead);
    }

    @Test
    public void testProcessElevenMin() throws Exception {

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MINUTE, 11);
        Date oneHourAhead = cal.getTime();

        enVivo.process(oneHourAhead);
    }

    @Test
    public void testProcessTenMin() throws Exception {

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MINUTE, 10);
        Date oneHourAhead = cal.getTime();

        enVivo.process(oneHourAhead);
    }

    @Test
    public void testProcessSixMin() throws Exception {

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MINUTE, 6);
        Date oneHourAhead = cal.getTime();

        enVivo.process(oneHourAhead);
    }

    @Test
    public void testProcessFiveMin() throws Exception {

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MINUTE, 5);
        Date oneHourAhead = cal.getTime();

        enVivo.process(oneHourAhead);
    }
}