package com.looksok;

import java.lang.System;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class StreamDemo{

    public static void main(String[] args){

        runStreamDemo();
    }

    private static void runStreamDemo() {
        namesDemo();
        userDemo();
    }

    private static void namesDemo() {
        List<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Jack");
        names.add("Joe");
        names.add("Michelle");

        List<String> collect = names.stream()
                .filter(item -> item.length() > 3)
                .map(item -> "Hello, " + item)
                .sorted((item1, item2) -> (item2.length() - item1.length()))
                .limit(1)
                .collect(toList());

        System.out.println(collect);
    }

    private static void userDemo() {
        List<User> users = new ArrayList<User>();
        users.add(new User("John", 21));
        users.add(new User("Jack", 13));
        users.add(new User("Joe", 56));
        users.add(new User("Michelle", 37));

        users.stream()
                .filter(item -> item.getAge() > 18)
                .sorted((item1, item2) -> (item1.getAge() - item2.getAge()))
                .forEach(System.out::println);
    }

}