package com.javarush.makhmudov.commands;

import com.javarush.makhmudov.constants.Alphabet;
import com.javarush.makhmudov.exceptions.AppException;
import com.javarush.makhmudov.util.PathBuilder;
import com.javarush.makhmudov.constants.Const;
import com.javarush.makhmudov.entity.Result;
import com.javarush.makhmudov.entity.ResultCode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public interface Action {
    Result execute(String[] parameters);

    public default Result copyWithKey(String sourceTextFile, String targetTextFile, int key) {
        Path source = PathBuilder.get(sourceTextFile);
        Path target = PathBuilder.get(targetTextFile);
        try (
                BufferedReader reader = Files.newBufferedReader(source);
                BufferedWriter writer = Files.newBufferedWriter(target)
        ) {
            int value;
            int length = Alphabet.alphabet.length;
            while ((value = reader.read()) > -1) {
                char character = (char) value;
                character = Character.toLowerCase(character);
                if (Alphabet.alphabetMap.containsKey(character)) {
                    Integer index = Alphabet.alphabetMap.get(character);
                    index = (index + key + Math.abs(key) * length) % length;
                    writer.write(Alphabet.alphabet[index]);
                } else if (character == '\n') {
                    writer.write(character);
                }
            }
        } catch (IOException e) {
            throw new AppException(Const.INCORRECT_FILE + e.getMessage(), e);
        }
        return new Result(targetTextFile, ResultCode.OK);
    }
}
