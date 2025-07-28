package commands;

import entity.Result;
import entity.ResultCode;

public class Decoder implements Action{
    @Override
    public Result execute(String[] parameters) {
        return new Result("decode all right" , ResultCode.OK);

    }
}
