package com.looksok;

import java.lang.System;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

class StreamDemo{

    public static void main(String[] args){

        runStreamDemo();
    }

    private static void runStreamDemo() {
        List<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Jack");
        names.add("Joe");
        names.add("Michelle");

        List<String> result = names.stream()
                .filter(item -> item.length() > 3)
                .filter((item -> item.startsWith("J")))
                .sorted((item1, item2) -> (item2.length() - item1.length()))
                .map(item -> "Hello, " + item)
                .map(item -> item.toUpperCase() + "!")
                .limit(1)
                .collect(toList());

        System.out.println(result);
    }

}