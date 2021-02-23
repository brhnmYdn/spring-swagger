package com.example.repository;

import com.example.entity.UserEntity;
import com.example.request.UserRequest;

import java.util.List;

public interface UserRepository {
    UserEntity createUser(UserRequest userRequest);
    List<UserEntity> getUserList();
    UserEntity  getUserById(Integer id);
}
