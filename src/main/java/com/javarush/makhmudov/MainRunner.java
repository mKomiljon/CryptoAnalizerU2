package com.javarush.makhmudov;

import com.javarush.makhmudov.entity.Result;

public class MainRunner {
    public static void main(String[] args) {
        //encode text.txt encode.txt 12
        Application application = new Application();
        Result result = application.run(args);
        System.out.println(result);
    }
}

//        int key=123; //<<<<< buni argumentdan olish mumkin (args)
//        String text="Привет медвед!"; //<<<<< (args)
//        String result="............."; //<<<<< (args)

