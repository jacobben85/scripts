package com.jbjohn.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Splitting string test
 */
public class SplitString {

    String stringForValidation = "another AND this AND test,another AND test,this AND test";

    List<String> tags = new ArrayList<>();


    public boolean process() {

        tags.add("this");
        tags.add("test");

        boolean flag = true;

        String[] conditions = stringForValidation.split(",");

        for (String condition: conditions) {
            System.out.println(condition);

            String[] andConditions = condition.split(" AND ");

            if (andConditions.length > 1) {
                flag = true;

                for (String andCondition: andConditions) {
                    System.out.println(andCondition);
                    if (!tags.contains(andCondition)) {
                        flag = false;
                    }
                }

                if (flag) {
                    return flag;
                }
            } else {
                if (tags.contains(condition)) {
                    return true;
                }
            }

        }

        return flag;
    }
}
