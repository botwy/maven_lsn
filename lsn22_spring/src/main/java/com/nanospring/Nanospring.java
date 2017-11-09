package com.nanospring;

import org.jboss.errai.reflections.Reflections;
import org.jboss.errai.reflections.scanners.SubTypesScanner;

import java.lang.reflect.Field;
import java.util.Set;


public class Nanospring {

    private Set<Class<? extends Object>> beans;

    public Nanospring(String str_package) {
        Reflections reflection = new Reflections(str_package, new SubTypesScanner());
        beans = reflection.getSubTypesOf(Object.class);
    }

    <T> T getBean(Class<T> type) throws IllegalAccessException, InstantiationException {
        for (Class<?> bean : beans) {
            if (bean.equals(type)) {
                T instance = (T) bean.newInstance();
                Field[] fields = bean.getDeclaredFields();
                for (Field field : fields
                        ) {
                    if (field.isAnnotationPresent(Nanoannotation.class)) {
                        field.setAccessible(true);
                        field.set(instance, field.getClass().newInstance());

                    }
                }
                return instance;
            }

        }
        return null;
    }
}
