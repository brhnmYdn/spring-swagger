package com.example.entity;

import io.swagger.annotations.ApiModelProperty;

public class UserEntity {
    @ApiModelProperty(notes = "The database generated User ID")
    private Integer id;
    @ApiModelProperty(notes = "The database generated User NAME")
    private String name;
    @ApiModelProperty(notes = "The database generated User SURNAME")
    private String surname;

    public UserEntity(Integer id, String name,  String surname){
        this.id = id;
        this.name = name;
        this.surname  = surname;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
