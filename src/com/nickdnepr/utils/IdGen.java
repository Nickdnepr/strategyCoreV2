package com.nickdnepr.utils;

public class IdGen {

    private static int id = 0;

    public static int getId() {
        return id++;
    }

}
