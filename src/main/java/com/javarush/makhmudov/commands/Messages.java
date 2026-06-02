package com.javarush.makhmudov.commands;

import com.javarush.makhmudov.constants.Const;

interface Messages {
    String[][][] QUESTIONS = new String[][][]{
            {
                    {Const.ENCODE},
                    {"Enter source  or enter for text.txt :", "text.txt"},
                    {"Enter destination or enter for encrypted.txt :", "encrypted.txt"},
                    {"Enter a key or enter for key=1 :", "1"},
            },
            {
                    {Const.DECODE},
                    {"Enter source  or enter for encrypted.txt :\", \"encrypted.txt"},
                    {"Enter destination or enter for decrypted.txt :", "decrypted.txt"},
                    {"Enter a key or enter for key=1 :", "1"},
            },
            {
                    {"Exit"},
            }
    };

    String ANSI_CYAN = "\u001B[36m";
    String ANSI_RED = "\u001B[31m";
    String ANSI_GREEN = "\u001B[32m";
    String ANSI_YELLOW = "\u001B[33m";
    String ANSI_BLUE = "\u001B[34m";

    String LINE = "-".repeat(20);
    String MESSAGE_SELECT_MODE = LINE + ANSI_CYAN + "\nPlease select mode:\n" + ANSI_RED + """
            1. Encrypt
            2. Decrypt
            3. Exit
            """ + ANSI_CYAN + LINE;

    String INCORRECT_SELECTION = "Incorrect selection";

    String OK_FORMAT = ANSI_GREEN + """
            ERROR
            Message: %s
            """ + ANSI_CYAN;

}
