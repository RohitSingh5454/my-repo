package com.example.blogApplication.controller;

import com.example.blogApplication.payloads.DtoUser;
import com.example.blogApplication.service.serviceImpl.userServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/userDetails")
public class userController {
    @Autowired
    private userServiceImpl userService;
    @PostMapping("/saveUser")
    public ResponseEntity<DtoUser> createUser(@Valid @RequestBody DtoUser dtoUser){
        DtoUser createUser=userService.createUser(dtoUser);
        return new ResponseEntity<>(createUser, HttpStatus.CREATED);
    }
    @PutMapping("/updateUser/{userId}")
    public ResponseEntity<DtoUser> updateUser(@RequestBody DtoUser dtoUser, @PathVariable("userId") Integer uid){
        DtoUser updateUser=this.userService.updateUser(dtoUser,uid);
        return new ResponseEntity<>(updateUser,HttpStatus.OK);
    }
    @DeleteMapping("/deleteById/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable Integer userId){
      this.userService.deleteUserById(userId);
      return new ResponseEntity<>(Map.of("message","user deleted successfull"),HttpStatus.OK);
    }
    @GetMapping("/getUserById/{id}")
    public ResponseEntity<DtoUser> getById(@PathVariable("id") Integer uid){
        return ResponseEntity.ok(this.userService.findUserById(uid));
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<DtoUser>> getAllUser(){
        return ResponseEntity.ok(this.userService.findAllUser());
    }
}
