package com.sirius.server;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Date:2019/6/28 20:27
 * @Author:高连棣
 */
public class MethodInvoke<T extends Annotation> {

    private Method method;
    private Object object;
    private T annotation;

    public MethodInvoke(Method method, Object object, T annotation) {
        this.method = method;
        this.object = object;
        this.annotation = annotation;
    }

    public void invoke(Object... params) {
        try {
            method.invoke(object, params);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public T getAnnotation() {
        return annotation;
    }
}
