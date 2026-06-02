package com.javarush.makhmudov.controller;

import com.javarush.makhmudov.commands.Action;
import com.javarush.makhmudov.entity.Result;
import com.javarush.makhmudov.entity.ResultCode;
import com.javarush.makhmudov.exceptions.AppException;

public class MainController {
    public Result doAction(String actionName, String[] parameters){

        Action action = Actions.find(actionName);
        try {
            return action.execute(parameters);
        }catch (NumberFormatException | AppException e){
            return new Result(e.getMessage(), ResultCode.ERROR);
        }
    }
}
