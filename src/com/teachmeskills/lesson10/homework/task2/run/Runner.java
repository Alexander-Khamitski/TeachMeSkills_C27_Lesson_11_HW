package com.teachmeskills.lesson10.homework.task2.run;

import com.teachmeskills.lesson10.homework.task2.service.StringService;

public class Runner {

    public static void main(String[] args) {
        String str = "day apple engineer swimming pool car evening film";
        StringService.getMaxLengthWord(str);
        StringService.getMinLengthWord(str);
    }
}
