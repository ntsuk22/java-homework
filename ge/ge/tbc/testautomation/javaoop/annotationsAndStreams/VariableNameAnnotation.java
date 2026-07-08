package ge.tbc.testautomation.javaoop.annotationsAndStreams;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface VariableNameAnnotation {
    String name() default "Default Value";
}
