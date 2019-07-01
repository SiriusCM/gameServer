package com.sirius.server.annotation;

import java.lang.annotation.*;

/**
 * @Date:2019/7/1 16:54
 * @Author:高连棣
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Login {

    int level() default 0;
}
