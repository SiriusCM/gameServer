package com.sirius.server.annotation;

import java.lang.annotation.*;

/**
 * @Date:2019/6/28 17:49
 * @Author:高连棣
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Schedule {

    String value();

    String[] params() default {};
}
