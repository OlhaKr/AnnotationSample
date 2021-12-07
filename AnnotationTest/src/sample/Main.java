package sample;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Class<?> cls = Test.class;

        Method[] methods = cls.getDeclaredMethods();

        for (Method m : methods) {
            if (m.isAnnotationPresent(Test.class)) {
                Test test = m.getAnnotation(Test.class);
                int results = (Integer) m.invoke(null, test.a(), test.b());
                System.out.println(results);
            }
        }

    }


}
