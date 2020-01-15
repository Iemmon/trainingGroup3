package classWork.annotationTask;

import classWork.annotationTask.annotations.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TestRunner {
    public void run(Class<?> z) throws Exception {
        Constructor<?> constructor = z.getConstructor();
        Object object = constructor.newInstance();
        Method[] methods = z.getDeclaredMethods();
        List<Method> testMethods = getMethodsByAnnotation(Test.class, methods);
        List<Method> beforeMethods = getMethodsByAnnotation(Before.class, methods);
        List<Method> afterMethods = getMethodsByAnnotation(After.class, methods);
        List<Method> beforeAllMethods = getMethodsByAnnotation(BeforeAll.class, methods);
        List<Method> afterAllMethods = getMethodsByAnnotation(AfterAll.class, methods);

        for (Method beforeAllM : beforeAllMethods){
            beforeAllM.invoke(object);
        }
        for(Method m : methods){
            if(m.equals(BeforeAll.class)){
                m.invoke(object);
                break;
            }
        }
        for (Method testMethod : testMethods) {
            for(Method beforeMethod : beforeMethods){
                beforeMethod.invoke(object);
            }
            testMethod.invoke(object);
            for (Method afterMethod : afterMethods){
                afterMethod.invoke(object);
            }
        }
        for (Method afterAllM : afterAllMethods){
            afterAllM.invoke(object);
        }
    }

    private List<Method> getMethodsByAnnotation(Class<? extends Annotation> annotation, Method[] methods){
        List<Method> tempMethods = new ArrayList<Method>();

        for (Method m : methods) {
            if (m.isAnnotationPresent(annotation)) {
                tempMethods.add(m);
            }
        }
        return tempMethods;
    }
}
//add annotation after, signature should be the same as jUnit annotation has
