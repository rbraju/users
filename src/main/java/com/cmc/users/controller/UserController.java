package com.cmc.users.controller;

import com.cmc.users.controller.model.Signin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String hello() {
        return "Hello User!";
    }


    @PostMapping(path = "/signin", consumes = "application/json", produces = "application/json")
    public String login(@RequestBody Signin signin) {
        String status = validate(signin.getUsername(), signin.getPassword()) ? "success" : "error";


        return "{ " +
                "\"username\": \"" + signin.getUsername() + "\"," +
                "\"status\": \"success\"" +
                " }";
    }

    private boolean validate(String username, String password) {
        boolean isValid = false;

        if (username.equalsIgnoreCase("admin") || username.equalsIgnoreCase("root"))
            if (password.equals("password"))
                isValid = true;

        return isValid;
    }
}
