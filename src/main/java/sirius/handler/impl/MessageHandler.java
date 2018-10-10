package sirius.handler.impl;

import sirius.handler.Handler;
import sirius.proto.MsgProto;
import sirius.proto.protobuf.Message;
import sirius.sprite.Player;

public class MessageHandler implements Handler {
    @Override
    public boolean handler(Player player, Object data) throws Exception {
        Message.Data message = (Message.Data) data;
        String op = message.getOp();
        double x = message.getX();
        double y = message.getY();
        double result;
        switch (op) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                result = x / y;
                break;
            default:
                return false;
        }
        logger.info(x + op + y + " = " + result);
        return true;
    }

    @Override
    public MsgProto getProto() {
        return MsgProto.Message;
    }
}
