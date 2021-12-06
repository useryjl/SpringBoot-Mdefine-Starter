package com.yjl.system;

import java.lang.annotation.*;

/**
 * @author yjl
 * @Description 自定义注解
 * @create 2021-11-30
 */

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnnotation {
    String value() default "";
}
