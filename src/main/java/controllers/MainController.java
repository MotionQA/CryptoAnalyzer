package controllers;

import commands.Action;
import entity.Result;

public class MainController {

    public Result doAction(String actionName, String[] parameters){
        Action action = Actions.find(actionName);
        Result result = action.execute(parameters);
        return result;

    }
}
