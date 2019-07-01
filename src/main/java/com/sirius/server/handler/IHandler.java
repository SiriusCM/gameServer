package com.sirius.server.handler;

import com.sirius.server.exception.GameException;
import com.sirius.server.proto.MsgRequest;
import com.sirius.server.sprite.Player;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
public interface IHandler {

    boolean handle(Player player, Object data) throws GameException, Exception;

    MsgRequest getProto();
}
