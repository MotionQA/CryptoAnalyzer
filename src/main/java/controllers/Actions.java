package controllers;

import commands.Action;
import commands.Decoder;
import commands.Encoder;
import exceptions.AppException;

public enum Actions {
    ENCODE(new Encoder()),
    DECODE(new Decoder());

    private final Action action;

    Actions (Action action){
        this.action = action;
    }

    public static Action find(String actionName){
       // try {


            Actions value = Actions.valueOf(actionName.toUpperCase());
            return value.action;
           // Object value = null;
         //   return null;
       // }catch (IllegalArgumentException e){
         //  throw new AppException();
       // }

    }

}
