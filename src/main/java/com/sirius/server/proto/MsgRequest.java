package com.sirius.server.proto;

import com.google.protobuf.Parser;
import com.sirius.server.handler.Handler;
import com.sirius.server.handler.impl.ComputeHandler;
import com.sirius.server.handler.impl.LoginHandle;
import com.sirius.server.handler.impl.MatchHandler;
import com.sirius.server.proto.protobuf.Compute;
import com.sirius.server.proto.protobuf.Login;
import com.sirius.server.proto.protobuf.Match;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 高连棣
 * @date 2018/6/30 18:47
 */
public enum MsgRequest {
    Content(101, new ComputeHandler(), Compute.Content.parser()),
    Login_In(1001, new LoginHandle(), Login.Position.parser()),
    Match_One(1015, new MatchHandler(), Match.Position.parser());

    private static final Map<Integer, MsgRequest> idMsgMap = new HashMap<>();

    static {
        for (MsgRequest msgProto : MsgRequest.values()) {
            idMsgMap.put(msgProto.getId(), msgProto);
        }
    }

    public static MsgRequest getMsgRequest(int msgId) {
        if (idMsgMap.containsKey(msgId)) {
            return idMsgMap.get(msgId);
        }
        return null;
    }

    private int id;

    private Handler handler;

    private Parser parser;

    MsgRequest(int id, Handler handler, Parser parser) {
        this.id = id;
        this.handler = handler;
        this.parser = parser;
    }

    public int getId() {
        return id;
    }

    public Handler getHandler() {
        return handler;
    }

    public Parser getParser() {
        return parser;
    }
}
