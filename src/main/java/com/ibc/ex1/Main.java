package com.ibc.ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FirstExAPIImpl firstExAPI = new FirstExAPIImpl();

        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        ArrayList<String> strings = new ArrayList<>();

        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        strings.add("Four");

        System.out.println(firstExAPI.collectString(integers, " "));
        System.out.println(firstExAPI.collectString(integers, "<>"));
        System.out.println(firstExAPI.collectString(strings, ""));

    }
}
