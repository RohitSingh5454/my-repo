package com.example.blogApplication.service.serviceImpl;

import com.example.blogApplication.entity.User;
import com.example.blogApplication.exception.ResourceNotFoundException;
import com.example.blogApplication.payloads.DtoUser;
import com.example.blogApplication.repository.userRepository;
import com.example.blogApplication.service.userService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class userServiceImpl implements userService {
    @Autowired
    private userRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public DtoUser createUser(DtoUser dtouser) {
        User user1=this.dtoToUser(dtouser);
       User savedUser= this.userRepository.save(user1);
        return this.userToDto(savedUser);
    }

    @Override
    public DtoUser findUserById(Integer userId) {
        User user=this.userRepository.findById(userId).
                orElseThrow(()->new ResourceNotFoundException("user","id",userId));
        return this.userToDto(user);
    }

    @Override
    public DtoUser updateUser(DtoUser user, Integer userId) {
        User user1=this.userRepository.findById(userId).
                orElseThrow(()->new ResourceNotFoundException("user","Id",userId));
        user1.setId(user.getId());
        user1.setName(user.getName());
        user1.setEmail(user.getEmail());
        user1.setAbout(user.getAbout());
        user1.setPassword(user.getPassword());
        User updatedUser=this.userRepository.save(user1);
       return this.userToDto(updatedUser);

    }

    @Override
    public List<DtoUser> findAllUser() {
        List<User> userList=this.userRepository.findAll();
        List<DtoUser> userDtos=userList.stream().map(user->this.userToDto(user)).collect(Collectors.toList());
        return userDtos;
    }

    @Override
    public void deleteUserById(Integer userid) {
    User user=  this.userRepository.findById(userid).
            orElseThrow(()->new ResourceNotFoundException("user","Id",userid));
             this.userRepository.delete(user);
    }
    public DtoUser userToDto(User user){
        /*dtoUser obj2=new dtoUser();
        obj2.setId(user.getId());
        obj2.setName(user.getName());
        obj2.setEmail(user.getEmail());
        obj2.setAbout(user.getAbout());
        obj2.setPassword(user.getPassword());
        return obj2;*/
        DtoUser mapUserToDto=modelMapper.map(user, DtoUser.class);
        return mapUserToDto;
    }
    public User dtoToUser(DtoUser dtoUser){
        /*User obj1=new User();
        obj1.setId(dtoUser.getId());
        obj1.setName(dtoUser.getName());
        obj1.setEmail(dtoUser.getEmail());
        obj1.setAbout(dtoUser.getAbout());
        obj1.setPassword(dtoUser.getPassword());
        return obj1;*/
        User mapdtoToUser=modelMapper.map(dtoUser, User.class);
        return mapdtoToUser;
    }
}
