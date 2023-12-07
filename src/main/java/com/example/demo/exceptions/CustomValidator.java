package com.example.demo.exceptions;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CustomValidator implements ConstraintValidator<CustomAnotation, Boolean> {
    private String message;

    @Override
    public void initialize(CustomAnotation constraintAnnotation) {
        this.message = constraintAnnotation.message();
    }

    @Override
    public boolean isValid(Boolean test, ConstraintValidatorContext constraintValidatorContext) {
        if (!test) {
            constraintValidatorContext.disableDefaultConstraintViolation();
            constraintValidatorContext.buildConstraintViolationWithTemplate(message).addConstraintViolation();
        }
        return test;
    }
}
