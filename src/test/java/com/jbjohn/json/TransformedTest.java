package com.jbjohn.json;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Transformed test
 */
public class TransformedTest {

    @Test
    public void testToString() throws Exception {
        Transformed transformed = new Transformed();

        transformed.setField1("field 1 value");
        transformed.setField2("field 2 value");
        transformed.setField3("field 3 value");

        List<String> tags = new ArrayList<>();
        tags.add("first");
        tags.add("second");
        tags.add("third");
        transformed.setTags(tags);

        transformed.setRename("Field renamed");

        System.out.println(transformed.toString());
    }
}