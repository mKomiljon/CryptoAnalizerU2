package com.javarush.makhmudov;


import com.javarush.makhmudov.commands.Menu;
import com.javarush.makhmudov.entity.Result;

import java.util.Scanner;

public class MainRunner {
    public static void main(String[] args) {
        //build console app
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu(input);
        Application application = new Application();
        Result result = application.run(args);
        System.out.println(result);
    }
}

