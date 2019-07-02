package com.sirius.server.proto;


import com.google.protobuf.GeneratedMessageV3;
import com.sirius.server.proto.protobuf.Compute;

import java.util.HashMap;
import java.util.Map;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
public enum MsgResponse {

    Result(Compute.Result.class, 102);

    private static final Map<Class<? extends GeneratedMessageV3>, MsgResponse> clazzMsgMap = new HashMap<>();

    static {
        for (MsgResponse e : MsgResponse.values()) {
            clazzMsgMap.put(e.getClazz(), e);
        }
    }

    public static MsgResponse getMsgResponse(Class clazz) {
        return clazzMsgMap.get(clazz);
    }

    private Class clazz;

    private int id;

    MsgResponse(Class clazz, int id) {
        this.clazz = clazz;
        this.id = id;
    }

    public Class getClazz() {
        return clazz;
    }

    public int getId() {
        return id;
    }
}
