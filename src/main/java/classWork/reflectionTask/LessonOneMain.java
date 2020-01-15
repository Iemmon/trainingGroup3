package classWork.reflectionTask;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class LessonOneMain {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        final Class<A> aClass = A.class;
        final Constructor<A> constructor = aClass.getDeclaredConstructor(int.class);
        constructor.setAccessible(true);
        final A a = constructor.newInstance(1);
        Method method = aClass.getDeclaredMethod("method");
        method.setAccessible(true);
        method.invoke(a);

        Method stMethod = aClass.getDeclaredMethod("staticMethod");
        stMethod.setAccessible(true);
        stMethod.invoke(A.class);
    }
}

class A {
    private A(int a) {

    }

    private void method() {
        System.out.println("non static method");
    }

    private static void staticMethod() {
        System.out.println("static method");
    }
}
