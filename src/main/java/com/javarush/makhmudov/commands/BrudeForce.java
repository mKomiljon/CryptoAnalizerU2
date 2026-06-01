package com.javarush.makhmudov.commands;

import com.javarush.makhmudov.entity.Result;
import com.javarush.makhmudov.entity.ResultCode;

public class BrudeForce implements Action {
    @Override
    public Result execute(String[] parameters) {
        //TODO something do
        return new Result("BrudeForce complete", ResultCode.OK);
    }
}
