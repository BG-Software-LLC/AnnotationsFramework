package com.bgsoftware.common.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation indicates that the annotation element of integer type, represents
 * a logical type and that its value should be one of the explicitly named constants.
 */
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE})
public @interface IntType {

    int[] value() default {};

}
