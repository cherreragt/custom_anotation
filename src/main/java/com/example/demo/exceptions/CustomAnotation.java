package com.example.demo.exceptions;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;

@Documented
@Constraint(validatedBy = CustomValidator.class)
@Target({FIELD})
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface CustomAnotation {
    String message() default "The password does not comply with the rules.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
