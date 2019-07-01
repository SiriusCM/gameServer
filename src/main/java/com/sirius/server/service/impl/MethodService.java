package com.sirius.server.service.impl;

import com.sirius.server.MethodInvoke;
import com.sirius.server.World;
import com.sirius.server.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.*;

/**
 * @Date:2019/6/28 21:56
 * @Author:高连棣
 */
@Service
public class MethodService<T extends Annotation> implements IService {

    private Map<Class<T>, List<MethodInvoke<T>>> methodMap = new HashMap<>();

    @Autowired
    private ClassService classService;

    public void init() {
        List<String> list = classService.getClazzName(World.class.getPackage().getName(), true);
        list.forEach(e -> {
            try {
                Class clazz = Class.forName(e);
                methodMap.put(clazz, findMethods(clazz));
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        });
    }

    public void trigger(Class<T> annotationClass) {
        methodMap.get(annotationClass).forEach(e -> e.invoke());
    }

    public List<MethodInvoke<T>> findMethods(Class<T> annotationClass) {
        List<MethodInvoke<T>> list = new ArrayList<>();
        World.getApplicationContext().getBeansOfType(Object.class).forEach((name, object) -> {
            for (Method method : object.getClass().getMethods()) {
                if (method.isAnnotationPresent(annotationClass)) {
                    T annotation = method.getAnnotation(annotationClass);
                    list.add(new MethodInvoke(method, object, new Object[]{}, annotation));
                }
            }
        });
        Collections.sort(list, Comparator.comparingInt(o -> 0));
        return list;
    }

    public List<MethodInvoke<T>> getMethods(Class<T> annotationClass) {
        return methodMap.get(annotationClass);
    }
}
