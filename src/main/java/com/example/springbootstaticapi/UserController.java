package com.example.springbootstaticapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/users")
    public List<UserResponse> getUsers() {
        return List.of(
                new UserResponse("Pavan", "Developer", "Active"),
                new UserResponse("Ananya", "Tester", "Active"),
                new UserResponse("Rahul", "Manager", "Inactive")
        );
    }
}
