package com.sirius.server.event;

import java.lang.annotation.*;

/**
 * @Date:2019/6/28 17:49
 * @Author:高连棣
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Schedule {

    int level() default 0;

    String value();

    String[] params() default {};
}
