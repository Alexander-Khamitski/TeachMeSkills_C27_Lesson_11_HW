package com.teachmeskills.lesson10.homework.task1.service;

public class EditDocNumberService {

    public static void editDocNumberAccordingTask1_1(String docNumber) {
        String[] array = docNumber.split("-");
        System.out.println(array[0] + array[2]);
    }

    public static void editDocNumberAccordingTask1_2(String docNumber) {
        String[] array = docNumber.split("-");
        System.out.println(
                array[0]
                        .concat("-")
                        .concat("***")
                        .concat("-")
                        .concat(array[2])
                        .concat("-")
                        .concat("***")
                        .concat("-")
                        .concat(array[4]));
    }

    public static void editDocNumberAccordingTask1_3(String docNumber) {
        String[] array = docNumber.split("-");
        System.out.println(
                array[1]
                        .concat("/")
                        .concat(array[3])
                        .concat("/")
                        .concat(String.valueOf(docNumber.charAt(docNumber.length() - 3)))
                        .concat("/")
                        .concat(String.valueOf(docNumber.charAt(docNumber.length() - 1)))
                        .toLowerCase()
        );
    }

    public static void editDocNumberAccordingTask1_4(String docNumber) {
        String[] array = docNumber.split("-");
        StringBuilder sb = new StringBuilder();
        String editedDocNumber =
                String.valueOf(sb
                        .append(array[1])
                        .append("/")
                        .append(array[3])
                        .append("/")
                        .append(docNumber.charAt(docNumber.length() - 3))
                        .append("/")
                        .append(docNumber.charAt(docNumber.length() - 1)));
        System.out.println("Letters: " + editedDocNumber.toUpperCase());
    }

    public static void editDocNumberAccordingTask1_5(String docNumber) {
        docNumber = docNumber.toLowerCase();
        String expectedValue = "abc";
        if (docNumber.contains(expectedValue)) {
            System.out.println("Document number contains next value: " + expectedValue);
        } else {
            System.out.println("Document number does not contain next value: " + expectedValue);
        }
    }

    public static void editDocNumberAccordingTask1_6(String docNumber) {
        String expectedValue = "555";
        if (docNumber.startsWith(expectedValue)) {
            System.out.println("Document number starts with: " + expectedValue);
        } else {
            System.out.println("Document number does not start with: " + expectedValue);
        }
    }

    public static void editDocNumberAccordingTask1_7(String docNumber) {
        String expectedValue = "1a2b";
        if (docNumber.endsWith(expectedValue)) {
            System.out.println("Document number ends with: " + expectedValue);
        } else {
            System.out.println("Document number does not end with: " + expectedValue);
        }
    }
}
