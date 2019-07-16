package com.sirius.server.service.impl;

import com.sirius.server.event.Handler;
import com.sirius.server.exception.sub.ComputeException;
import com.sirius.server.msg.MsgRequest;
import com.sirius.server.msg.protobuf.Compute;
import com.sirius.server.service.IService;
import com.sirius.server.sprite.Player;
import org.springframework.stereotype.Service;

/**
 * @Date:2019/7/15 22:38
 * @Author:高连棣
 */
@Service
public class TestService implements IService {

    @Handler(msg = MsgRequest.Content)
    public void handler(Player player, Object data) throws ComputeException {
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
    }
}
