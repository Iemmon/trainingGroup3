package annotationtask.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Test {

    Class<? extends Throwable> expectedException() default NoneException.class;
    String expectedMessage() default "";

    class NoneException extends Throwable{

    }
}
