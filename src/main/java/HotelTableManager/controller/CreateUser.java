package HotelTableManager.controller;

import HotelTableManager.model.User;
import HotelTableManager.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CreateUser {
    @Autowired
    UserRepo userRepo;

    @PostMapping("/")
    public String CreateUsers(@RequestBody User user){

        return user.toString();
    }
}
