package com.prime.main;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy=PasswordMatchingValidator.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordMatching {
    String password();
    String confirmPassword();
    String message() default "Passwords do not match";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default{};

    @Target({ ElementType.TYPE })
    @Retention(RetentionPolicy.RUNTIME)
    @interface List {
        PasswordMatching[] value();
    }
}
