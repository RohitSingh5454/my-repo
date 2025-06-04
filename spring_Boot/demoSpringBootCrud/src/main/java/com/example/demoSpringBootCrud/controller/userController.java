package com.example.demoSpringBootCrud.controller;

import com.example.demoSpringBootCrud.entity.User;
import com.example.demoSpringBootCrud.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {
    @Autowired
    private userService userService;
    @PostMapping("saveUser")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        User saveUser=userService.saveUser(user);
        return new ResponseEntity<>(saveUser, HttpStatus.CREATED);
    }
    @GetMapping("getById/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Integer id){
        User user=userService.getUserById(id);
        return new ResponseEntity<>(user,HttpStatus.OK);
    }
    @GetMapping("getAll")
    public ResponseEntity<List<User>> getAll(){
        List<User> userList=userService.getAll();
        return new ResponseEntity<>(userList,HttpStatus.OK);
    }
    @PutMapping("updateUser")
    public ResponseEntity<User> updateUser(User user,Integer id){
        user.setUid(id);
        User updateUser=userService.updateUser(user);
        return new ResponseEntity<>(updateUser,HttpStatus.OK);
    }
}
