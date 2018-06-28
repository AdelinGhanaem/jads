package com;

public class Utils {


    public static int intChar(char c) {

        if (((int) c >= 65 && (int) c <= 90))
            return (int) c - 65;

        if (((int) c >= 97 && (int) c <= 121))
            return (int) c - 97;

        throw new IllegalArgumentException("Not from [A-Za-z]");
    }
}
