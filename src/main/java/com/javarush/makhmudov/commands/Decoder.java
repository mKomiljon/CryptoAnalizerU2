package com.javarush.makhmudov.commands;

import com.javarush.makhmudov.entity.Result;
import com.javarush.makhmudov.entity.ResultCode;

public class Decoder implements Action {
    @Override
    public Result execute(String[] parameters) {
        //TODO something do
        return new Result("decode all right", ResultCode.OK);
    }
}
