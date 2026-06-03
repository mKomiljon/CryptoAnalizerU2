package com.javarush.makhmudov;


import com.javarush.makhmudov.console.ConsoleApp;
import com.javarush.makhmudov.console.Menu;
import com.javarush.makhmudov.controller.MainController;

import java.util.Scanner;

public class MainRunner {
    public static void main(String[] args) {
        //build console app
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu(input);
        MainController mainController = new MainController();
        ConsoleApp application = new ConsoleApp(mainController, menu);
        application.run(args);
    }
}

