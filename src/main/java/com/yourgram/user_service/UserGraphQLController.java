package com.yourgram.user_service;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class UserGraphQLController {

    private final UserService userService;

    UserGraphQLController(UserService userService) {
        this.userService = userService;
    }

    @MutationMapping
    public User registerUser(@Argument RegisterRequest registerRequest) {
        return userService.registerUser(registerRequest);
    }

    @QueryMapping
    public Optional<User> userById(@Argument Long id) {
        return userService.userById(id);
    }
}

