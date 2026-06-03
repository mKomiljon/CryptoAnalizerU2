package com.javarush.makhmudov.commands;

import com.javarush.makhmudov.entity.Result;
import com.javarush.makhmudov.entity.ResultCode;

public class BruteForce implements Action {
    @Override
    public Result execute(String[] parameters) {
        //TODO something do
        return new Result(ResultCode.OK, "BruteForce complete");
    }
}
