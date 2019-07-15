package com.sirius.server.event;

import com.sirius.server.proto.MsgRequest;

/**
 * @Date:2019/7/15 22:36
 * @Author:高连棣
 */
public @interface Handler {

    MsgRequest msg();
}
