package com.prime.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CreateAccountController {
    
    @GetMapping("/createAccount")
    String createAccount() {
        return "createAccount";
    }
}
