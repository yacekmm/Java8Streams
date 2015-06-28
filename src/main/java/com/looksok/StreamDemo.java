package com.looksok;

import java.lang.System;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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

        names.stream()
            .filter(item -> item.length() > 3)
            .filter((item -> item.startsWith("J")))
            .sorted((item1, item2) -> (item2.length() - item1.length()))
            .map(item -> "Hello, " + item)
            .map(item -> item.toUpperCase() + "!")
            .forEach(System.out::println);
    }

}