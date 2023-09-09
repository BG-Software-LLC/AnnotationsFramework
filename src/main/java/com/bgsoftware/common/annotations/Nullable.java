package com.bgsoftware.common.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation indicates that the element annotated may be null.
 *
 * When decorating a method with {@link Nullable}, this indicates that the method
 * may return a null value and this case should be handled as well.
 *
 * When decorating a parameter with {@link Nullable}, this indicates that the method
 * handles the parameter in case it is null.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
public @interface Nullable {
}
