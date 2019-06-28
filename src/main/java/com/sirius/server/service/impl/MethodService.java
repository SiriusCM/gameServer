package com.sirius.server.service.impl;

import com.sirius.server.MethodInvoke;
import com.sirius.server.World;
import com.sirius.server.service.IService;
import org.springframework.stereotype.Service;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @Date:2019/6/28 21:56
 * @Author:高连棣
 */
@Service
public class MethodService<T extends Annotation> implements IService {

    public List<MethodInvoke<T>> getMethods(Class<T> annotationClass) {
        List<MethodInvoke<T>> list = new ArrayList<>();
        World.getApplicationContext().getBeansOfType(Object.class).forEach((name, object) -> {
            for (Method method : object.getClass().getMethods()) {
                if (method.isAnnotationPresent(annotationClass)) {
                    T annotation = method.getAnnotation(annotationClass);
                    list.add(new MethodInvoke(method, object, annotation));
                }
            }
        });
        return list;
    }
}
