package com.teachmeskills.lesson10.homework.task1.run;

import com.teachmeskills.lesson10.homework.task1.service.EditDocNumberService;

public class Runner {

    public static void main(String[] args) {
        String docNumber = "1346-abc-5689-gHt-4J8T";
        System.out.println("Default doc number: " + docNumber);
        EditDocNumberService.editDocNumberAccordingTask1_1(docNumber);
        EditDocNumberService.editDocNumberAccordingTask1_2(docNumber);
        EditDocNumberService.editDocNumberAccordingTask1_3(docNumber);
        EditDocNumberService.editDocNumberAccordingTask1_4(docNumber);
        EditDocNumberService.editDocNumberAccordingTask1_5(docNumber);
        EditDocNumberService.editDocNumberAccordingTask1_6(docNumber);
        EditDocNumberService.editDocNumberAccordingTask1_7(docNumber);
    }
}
