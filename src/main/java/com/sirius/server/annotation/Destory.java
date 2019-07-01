package com.sirius.server.annotation;

import java.lang.annotation.*;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Destory {

    int level() default 0;
}
