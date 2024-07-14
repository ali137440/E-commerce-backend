package com.Haider.ECommerce.controller;

import com.Haider.ECommerce.model.User;
import com.Haider.ECommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")
@CrossOrigin("*")

@RestController
public class UserController {

    @Autowired
    public UserService userService;

    //create user
    @PostMapping("/createUser")
//    @CrossOrigin(origins = "http://localhost:4200")
    public User createUser(@RequestBody User user) {
        return userService.save(user);
    }

    //userloggin or not
    @GetMapping("/isUserIsActiveOrNot/{userName}/{password}")
//    @CrossOrigin(origins = "http://localhost:4200")
    public boolean isUserIsActiveOrNot(@PathVariable ("userName") String userName,@PathVariable ("password") String password){
        List<User> userList=userService.findByUserNameAndPassword(userName,password);
        if(userList.size()>0){
            return true;
        }
        return false;
    }

    //get user detail by id

    @GetMapping("/getUserDetailsById/{id}")
//    @CrossOrigin(origins = "http://localhost:4200")
    public User getUserDetailsById(@PathVariable ("id") String id){
        return userService.findById(id).orElse(null);
    }

    //get All the User Details

    @GetMapping("/getAllTheUserDetails")
//    @CrossOrigin(origins = "http://localhost:4200")
    public List<User> getAllTheUserDetails(){
        return userService.findAll();
    }

    //delete user details by Id

    @DeleteMapping("/deleteUserById/{id}")
//    @CrossOrigin(origins = "http://localhost:4200")
    public User deleteUserById(@PathVariable ("id") String id){
        userService.deleteById(id);
        return null;
    }
}
