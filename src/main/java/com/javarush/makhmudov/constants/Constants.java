package com.javarush.makhmudov.constants;

import java.io.File;
import java.nio.file.Files;

public class Constants {
    private static final String rus = "ЙЦУКЕНГШЩЗХЪЭЖДЛОРПАВЫФЯЧСМИТЬБЮ";
    private static final String eng = "QWERTYUIOPLKJHGFDSAZXCVBNM";
    private static final String son = "0123456789";
    private static final String belgi = "!@#$%^&*()_+|-=\\[]{}';:/.,<>?";

    private static final String ALPHABET = rus + eng + rus.toLowerCase() + eng.toLowerCase() + son + belgi;
    public static final String TXT_FOLDER=System.getProperty("user.dir")+ File.separator+"text"+File.separator;
}
