package com.example.controller;

import com.example.entity.UserEntity;
import com.example.repository.UserRepositoryImpl;
import com.example.request.UserRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/user")
@Api(value = "User Rest Api", description = "User Rest Service")
public class UserController {

    @Autowired
    private UserRepositoryImpl userRepository;

    @ApiResponses(
            value={
                    @ApiResponse(code = 403, message = "Forbidden"),
                    @ApiResponse(code = 404, message = "Not found"),
                    @ApiResponse(code = 500, message = "Server error")
            }
    )

    @ApiOperation(value = "Create Student", response = UserEntity.class )
    @RequestMapping(value = "/create", method =  RequestMethod.POST)
    @ResponseBody
    public UserEntity create(@RequestBody UserRequest userRequest){
        return userRepository.createUser(userRequest);
    }

    @ApiOperation(value = "Get User List" ,response = UserEntity.class)
    @RequestMapping(value = "/userList", method = RequestMethod.GET)
    @ResponseBody
    public List<UserEntity> getUsers(){
        return userRepository.getUserList();
    }

    @ApiOperation(value = "Get User By Id", response = UserEntity.class)
    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    @ResponseBody
    public UserEntity getUser(@PathVariable Integer id){
        return userRepository.getUserById(id);
    }

}
