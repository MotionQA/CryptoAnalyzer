package controllers;

import commands.Action;
import commands.Decoder;
import commands.Encoder;
import exceptions.AppException;

public enum Actions {
    ENCODE(new Encoder()),
    DECODE(new Decoder());

    private final Action action;

    Actions(Action action) {
        this.action = action;
    }

    public static Action find(String actionName) {
        if (actionName == null) {
            throw new AppException("Action name cannot be null");
        }

        try {
            Actions value = Actions.valueOf(actionName.toUpperCase());
            return value.action;
        } catch (IllegalArgumentException e) {
            throw new AppException("Invalid action: " + actionName, e);
        }
    }
}