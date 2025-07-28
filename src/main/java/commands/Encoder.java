package commands;

import entity.Result;
import entity.ResultCode;

public class Encoder implements Action{
    @Override
    public Result execute(String[] parameters) {
        return new Result("encode all right" , ResultCode.OK);
    }
}
