import org.jboss.errai.reflections.Reflections;
import org.jboss.errai.reflections.scanners.SubTypesScanner;
import sun.reflect.Reflection;

import java.lang.reflect.Field;
import java.util.Set;


public class Nanospring {

    private Set<Class<? extends Object>> beans;

    public Nanospring(String str_package) {
        Reflections reflection = new Reflections(str_package, new SubTypesScanner());
        beans = reflection.getSubTypesOf(Object.class);
    }

   <T> T getBean(Class<T> type) {
        for (Class<?> bean:beans) {
            Field[] fields = bean.getDeclaredFields();
            for (Field field:fields
                 ) {
                if (field.)
            }
        }
    }
}
