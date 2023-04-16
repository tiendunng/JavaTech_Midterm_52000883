package com.example.demo.service;
//
//
//import com.example.demo.module.User;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import net.javaguides.springboot.dto.UserDto;
//import net.javaguides.springboot.entity.User;
//public interface UserService {
//    void saveUser(UserDto userDto);
//
//    User findUserByEmail(String email);
//
//    List<UserDto> findAllUsers();
//}


import com.example.demo.dto.UserDto;
import com.example.demo.module.User;

import java.util.List;
//@Configuration
//@Service
public interface UserService {
    void saveUser(UserDto userDto);


    User findByEmail(String email);

    List<UserDto> findAllUsers();
}