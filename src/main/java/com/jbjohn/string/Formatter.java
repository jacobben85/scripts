package com.jbjohn.string;

import org.apache.commons.lang.text.StrSubstitutor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * String formatter.
 */
public class Formatter {

    private Date dateValue;

    public Formatter(Date dateValue) {
        this.dateValue = dateValue;
    }

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
            SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            dateFormatted = dateFormat.format(dateValue);
        } catch (Exception e) {

        }

        return dateFormatted;
    }

}
