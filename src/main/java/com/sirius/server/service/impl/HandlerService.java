package com.sirius.server.service.impl;

import com.google.protobuf.InvalidProtocolBufferException;
import com.sirius.server.MethodInvoke;
import com.sirius.server.World;
import com.sirius.server.event.Handler;
import com.sirius.server.event.Init;
import com.sirius.server.msg.MsgRequest;
import com.sirius.server.msg.ProtoBuf;
import com.sirius.server.service.IService;
import io.netty.channel.ChannelHandlerContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Date:2019/7/16 11:22
 * @Author:gaoliandi
 */
@Service
public class HandlerService implements IService {

    @Autowired
    private World world;

    @Autowired
    private MethodService methodService;

    private Map<MsgRequest, MethodInvoke<Handler>> handlerMap = new HashMap<>();

    @Init
    public void init() {
        List<MethodInvoke<Handler>> list = methodService.getMethods(Handler.class);
        list.forEach(e -> handlerMap.put(e.getAnnotation().msg(), e));
    }

    public void handler(ChannelHandlerContext ctx, ProtoBuf.Message message) throws InvalidProtocolBufferException {
        MsgRequest request = MsgRequest.getMsgRequest(message.getId());
        MethodInvoke<Handler> methodInvoke = handlerMap.get(request);
        methodInvoke.invoke(world.getPlayerByCtx(ctx), request.getParser().parseFrom(message.getData()));
    }
}
