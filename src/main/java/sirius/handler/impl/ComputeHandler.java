package sirius.handler.impl;

import sirius.handler.Handler;
import sirius.proto.MsgRequest;
import sirius.proto.protobuf.Compute;
import sirius.sprite.Player;

public class ComputeHandler implements Handler {
    @Override
    public boolean handler(Player player, Object data) throws Exception {
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
                return false;
        }
        Compute.Result.Builder builder = Compute.Result.newBuilder();
        builder.setResult(r);
        player.sendMsg(builder.build());
        logger.info(x + op + y + " = " + r);
        return true;
    }

    @Override
    public MsgRequest getProto() {
        return MsgRequest.Content;
    }
}
