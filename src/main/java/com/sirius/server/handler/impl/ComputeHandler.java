package com.sirius.server.handler.impl;


import com.sirius.server.exception.GameException;
import com.sirius.server.exception.sub.ComputeException;
import com.sirius.server.handler.IHandler;
import com.sirius.server.proto.MsgRequest;
import com.sirius.server.proto.protobuf.Compute;
import com.sirius.server.sprite.Player;
import org.springframework.stereotype.Component;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
@Component
public class ComputeHandler implements IHandler {

    @Override
    public boolean handle(Player player, Object data) throws GameException, Exception {
        Compute.Content content = (Compute.Content) data;
        String op = content.getOp();
        double x = content.getX();
        double y = content.getY();
        double r;
        switch (op) {
            case "+":
                r = x + y;
                break;
            case "-":
                r = x - y;
                break;
            case "*":
                r = x * y;
                break;
            case "/":
                r = x / y;
                break;
            default:
                throw new ComputeException();
        }
        Compute.Result.Builder builder = Compute.Result.newBuilder();
        builder.setResult(r);
        player.sendMsg(builder.build());
        return true;
    }

    @Override
    public MsgRequest getProto() {
        return MsgRequest.Content;
    }
}
