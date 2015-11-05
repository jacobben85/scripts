package com.jbjohn.scripts;

import java.util.TimeZone;

/**
 * Time drop down
 */
public class TimeDropDown {

    public void printTimeZones() {
        String [] ids = TimeZone.getAvailableIDs();
        for (String id:ids) {
            System.out.println(id);
        }
    }
}
