package com.javarush.makhmudov.commands;

import com.javarush.makhmudov.entity.Result;

public interface Action {
    Result execute(String[] parameters);

}
