package com.cmc.users.controller;

import com.cmc.users.controller.model.Signin;
import com.cmc.users.controller.model.SigninResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Success");
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello User!";
    }

    @PostMapping(path = "/signin", consumes = "application/json", produces = "application/json")
    public ResponseEntity<SigninResponse> login(@RequestBody Signin signin) {
        ResponseEntity<SigninResponse> response = null;

        response = (validate(signin.getUsername(), signin.getPassword())) ?
                ResponseEntity.ok(new SigninResponse(signin.getUsername(), "success")) :
                ResponseEntity.ok(new SigninResponse(signin.getUsername(), "Invalid username or password"));

        return response;
    }

    private boolean validate(String username, String password) {
        boolean isValid = false;

        if (username.equalsIgnoreCase("admin") || username.equalsIgnoreCase("root"))
            if (password.equals("password"))
                isValid = true;

        return isValid;
    }
}
