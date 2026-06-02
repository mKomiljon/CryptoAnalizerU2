package com.javarush.makhmudov.commands;

import com.javarush.makhmudov.entity.Result;

public class CommandEncoder implements Action {
    @Override
    public Result execute(String[] parameters) {
        //TODO something do
        String sourceTextFile = parameters[0];
        String encryptedFile = parameters[1];
        int key = Integer.parseInt(parameters[2]);
//        return new Result("encode all right", ResultCode.OK);
        return copyWithKey(sourceTextFile, encryptedFile, key);
    }



}
