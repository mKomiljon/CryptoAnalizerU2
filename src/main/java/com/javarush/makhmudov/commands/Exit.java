package com.javarush.makhmudov.commands;

import com.javarush.makhmudov.constants.Const;
import com.javarush.makhmudov.entity.Result;
import com.javarush.makhmudov.entity.ResultCode;

public class Exit implements Action {

    @Override
    public Result execute(String[] parameters) {
        return new Result(ResultCode.OK, Const.APPLICATION_CLOSED);
    }
}
