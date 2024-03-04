package com.prime.main;

import jakarta.validation.ConstraintValidator;

public class PasswordMatchingValidator implements ConstraintValidator<PasswordMatching, Object> {
    private String password;
    private String confirmPassword;

    @Override
}
