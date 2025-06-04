package com.example.blogApplication.service;

import com.example.blogApplication.payloads.DtoUser;

import java.util.List;

public interface userService {
   DtoUser createUser(DtoUser user);
   DtoUser findUserById(Integer userId);
   DtoUser updateUser(DtoUser user, Integer uid);
   List<DtoUser> findAllUser();
   void deleteUserById(Integer userid);

}
