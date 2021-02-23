package com.example.repository;

import com.example.entity.UserEntity;
import com.example.request.UserRequest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Override
    public UserEntity createUser(UserRequest userRequest) {
        return new UserEntity(
                userRequest.getId(), userRequest.getName(), userRequest.getSurname());
    }

    @Override
    public List<UserEntity> getUserList() {
        List<UserEntity> userEntities = new ArrayList<>();
        userEntities.add(new UserEntity(1,"abc", "cde"));
        userEntities.add(new UserEntity(2,"abc", "cde"));
        userEntities.add(new UserEntity(3,"abc", "cde"));
        userEntities.add(new UserEntity(4,"abc", "cde"));
        return userEntities;
    }

    @Override
    public UserEntity getUserById(Integer id) {
        List<UserEntity> userEntities = getUserList();
        return  userEntities.stream().filter(item -> item.getId().equals(id)).collect(Collectors.toList()).get(0);
    }
}
