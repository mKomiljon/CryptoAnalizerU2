package com.javarush.makhmudov.constants;

import java.util.HashMap;
import java.util.Map;

public class Alphabet {
    private static final String rus = "ЙЦУКЕНГШЩЗХЪЭЖДЛОРПАВЫФЯЧСМИТЬБЮ";
    private static final String belgi = "!@#$%^&*()_+|-=\\[]{}';:/.,<>?";

    public static final char[] alphabet = (rus.toLowerCase() + belgi).toCharArray();

    public final static Map<Character, Integer> alphabetMap = new HashMap<>();

    static  {
        for (int i = 0; i < alphabet.length; i++) {
            alphabetMap.put(alphabet[i], i);
        }
    }
}
