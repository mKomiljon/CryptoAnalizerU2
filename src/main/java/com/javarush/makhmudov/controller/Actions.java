package com.javarush.makhmudov.controller;


import com.javarush.makhmudov.commands.Action;
import com.javarush.makhmudov.commands.CommandEncoder;
import com.javarush.makhmudov.commands.Decoder;
import com.javarush.makhmudov.exceptions.AppException;

public enum Actions {
    ENCODE(new CommandEncoder()),
    DECODE(new Decoder());

    private final Action action;

    Actions(Action action) {
        this.action = action;
    }

    public static Action find(String actionName) {
        try {
            Actions value = Actions.valueOf(actionName.toUpperCase());
            return value.action;
        } catch (IllegalArgumentException e) {
            throw new AppException("not found " + actionName, e);
        }
    }
}
