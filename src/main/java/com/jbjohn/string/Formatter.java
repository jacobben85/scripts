package com.jbjohn.string;

import org.apache.commons.lang.text.StrSubstitutor;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * String formatter.
 */
public class Formatter {

    public void process(String testString, String format) {

        Map<String, String> valueMap = new HashMap<>();
        StrSubstitutor substitution = new StrSubstitutor(valueMap);

        valueMap.put("replaceString1", "first string");
        valueMap.put("replaceString2", "second string");

        String dateFormatted = formattedString(format);

        if (dateFormatted != null) {
            valueMap.put("date", dateFormatted);
            System.out.println(substitution.replace(testString));
        }
    }

    private String formattedString(String format) {
        String dateFormatted = null;

        try {
            String minutes = "-10";
            Integer integer = new Integer(minutes);
            System.out.println(integer);
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.MINUTE, integer);
            Date date = cal.getTime();

            SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            dateFormatted = dateFormat.format(date);
        } catch (Exception e) {

        }

        return dateFormatted;
    }

}
