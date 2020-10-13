package com.user.userservice.Controller;



import com.shashi.userservice.Model.User;
import com.shashi.userservice.Repository.UserRepository;
import com.shashi.userservice.exception.UserNotFoundException;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class UserResource {
    @Autowired
    private UserRepository repository;
    @ApiOperation(value = "Find all the User")
    @GetMapping("/users")
    List<User> findAll() {
        return repository.findAll();
    }

    @ApiOperation(value = "Register New User")
    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    User newUser(@RequestBody User newUser) {
        return repository.save(newUser);
    }


    @ApiOperation(value = "Find User by Id ")
    @GetMapping("/users/{id}")
    User findOne(@PathVariable int id) {
        return repository.findById(id)

    }

}
