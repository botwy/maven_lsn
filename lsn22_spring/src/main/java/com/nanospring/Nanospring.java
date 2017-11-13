package com.nanospring;



import com.nanospring.pojo.NanoSpringDI;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;

import java.lang.reflect.Field;
import java.util.Set;


public class Nanospring {

    private String packages;
    private final Set<Class<?>> beans;

    public Nanospring(String str_packages) {
        this.packages=str_packages;
       // Reflections reflection = new Reflections(packages, new SubTypesScanner(false));
        Reflections reflection = new Reflections(packages, new SubTypesScanner(false));
        beans = reflection.getSubTypesOf(Object.class);
    }

    <T> T getBean(Class<T> type) throws IllegalAccessException, InstantiationException {
        for (Class<?> bean : beans) {
            if (bean.equals(type)) {
                T instance = (T) bean.newInstance();
                Field[] fields = instance.getClass().getDeclaredFields();
                for (Field field : fields
                        ) {
                    if (field.isAnnotationPresent(NanoSpringDI.class)) {
                        field.setAccessible(true);
                        field.set(instance, field.getType().newInstance());

                    }
                }
                return instance;
            }

        }
        throw new RuntimeException("Anythings goes wrongs");
    }
}
