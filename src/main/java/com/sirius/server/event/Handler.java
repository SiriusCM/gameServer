package com.sirius.server.event;

import com.sirius.server.msg.MsgRequest;

import java.lang.annotation.*;

/**
 * @Date:2019/7/15 22:36
 * @Author:高连棣
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Handler {

    MsgRequest msg();
}
