package com.teachmeskills.lesson10.homework.task3.service;

public class StringService {

    public static void duplicateEachChar(String str) {
        String[] arr = str.split("");
        String duplicatedEachCharWord = "";
        for (String string : arr) {
            duplicatedEachCharWord = duplicatedEachCharWord.concat(string).concat(string);
        }
        System.out.println(str.concat(" -> ").concat(duplicatedEachCharWord));
    }
}
