package com.sirius.server.proto;

import com.google.protobuf.Parser;
import com.sirius.server.proto.protobuf.Compute;

import java.util.HashMap;
import java.util.Map;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
public enum MsgRequest {

    Content(101, Compute.Content.parser());

    private static final Map<Integer, MsgRequest> idMsgMap = new HashMap<>();

    static {
        for (MsgRequest msgProto : MsgRequest.values()) {
            idMsgMap.put(msgProto.getId(), msgProto);
        }
    }

    public static MsgRequest getMsgRequest(int msgId) {
        return idMsgMap.get(msgId);
    }

    private int id;

    private Parser parser;

    MsgRequest(int id, Parser parser) {
        this.id = id;
        this.parser = parser;
    }

    public int getId() {
        return id;
    }

    public Parser getParser() {
        return parser;
    }
}
