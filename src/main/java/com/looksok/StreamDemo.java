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
//        namesDemo();

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
        List<User> names = new ArrayList<User>();
        names.add(new User("John", 21));
        names.add(new User("Jack", 13));
        names.add(new User("Joe", 56));
        names.add(new User("Michelle", 37));

        Stream<User> result = names.stream()
                .filter(item -> {
                    return item.getAge() > 50;
                });
//                .collect(toList());

//        result.
//                forEach(System.out::println);

        names.add(new User("Arnold", 38));

        result.
                forEach(System.out::println);


        System.out.println(result);
    }

}