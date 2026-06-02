package com.javarush.makhmudov.commands;

import com.javarush.makhmudov.entity.Result;

public class Decoder implements Action {
    @Override
    public Result execute(String[] parameters) {
        //TODO something do
        String encryptedFilename = parameters[0];
        String decryptedFilename = parameters[1];
        int key = Integer.parseInt(parameters[2]);
        return copyWithKey(encryptedFilename, decryptedFilename, -1 * key);
    }
}
