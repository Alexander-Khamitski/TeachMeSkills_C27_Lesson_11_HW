package com.teachmeskills.lesson10.homework.task2.service;

public class StringService {

    public static void getMaxLengthWord(String str) {
        String[] arr = str.split(" ");
        String maxLengthWord = "";
        for (String string : arr) {
            if (string.length() >= maxLengthWord.length()) {
                maxLengthWord = string;
            }
        }
        System.out.println("Max length word is: " + maxLengthWord);
    }

    public static void getMinLengthWord(String str) {
        String[] arr = str.split(" ");
        String minLengthWord = arr[0];
        for (String string : arr) {
            if (string.length() <= minLengthWord.length()) {
                minLengthWord = string;
            }
        }
        System.out.println("Min length word is: " + minLengthWord);
    }
}
