package annotation.basic;

import util.MyLogger;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationElement {
    String value();
    int count() default 0;
    String[] tags() default {};

    //MyLogger data(); //다른 타입은 적용 x
    Class<? extends MyLogger> annoData() default MyLogger.class;
}