package org.example.UserOrder.Controller;

import jakarta.validation.Valid;
import org.example.UserOrder.Model.User;
import org.example.UserOrder.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class UserController {

    @Autowired
    UserService userService;


    //Add Users
    @PostMapping("users")
    String addUsers(@Valid @RequestBody List<User> users)
    {
        return userService.addUsers(users);
    }

    // Get User by Id
    @GetMapping("getUser/{Id}")
    User getUser(@PathVariable Integer Id)
    {
        return userService.getUser(Id);
    }
}
