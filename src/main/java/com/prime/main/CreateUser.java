package com.prime.main;


import org.springframework.data.annotation.Id;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@PasswordMatching(
    password = "password",
    confirmPassword = "confirmPassword",
    message = "Passwords do not match"
)
@Data
public class CreateUser {

    @Id
    private long id;

    @NotBlank(message="Username required")
    @Size(min=5, message="Username must be at least 5 characters")
    private String username;

    @NotBlank(message="Password required")
    @Size(min=8, message="Password must be at least 8 characters")
    @Pattern(regexp=".*[0-9].*", message="Must contain at least one number character")
    @Pattern(regexp=".*[$&+,:;=?@#|'<>.^*()%!-].*", message="Must contain at least one special character")
    private String password;

    private String confirmPassword;
}
