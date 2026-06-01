package com.javarush.makhmudov.controller;

import com.javarush.makhmudov.commands.Action;
import com.javarush.makhmudov.entity.Result;

public class MainController {
    public Result doAction(String actionName, String[] parameters){
        //action == encode
        //parameters = [text.txt, encode.txt 12]
        Action action = Actions.find(actionName);
        Result result = action.execute(parameters);
        return result;
    }
}
