package com.jbjohn.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Trials - Java8 scripts
 */
public class Trials {

    public void ListTrials() {
        List<String> tags = new ArrayList<>();

        tags.add("Testing 1");
        tags.add("Testing 2");
        tags.add("Testing 3");
        tags.add("Testing 4");
        tags.add("Testing 5");

        tags.add("Testing 6");
        tags.add("Testing 7");
        tags.add("Testing 8");
        tags.add("Testing 9");

        tags.forEach((title -> title.replace("Testing", "Another")));
        System.out.println(tags);


        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("test1", "test1");
        hashMap.put("test2", "test2");

        hashMap.hashCode();
    }
}
