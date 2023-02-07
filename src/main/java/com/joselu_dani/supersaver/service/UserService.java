package com.joselu_dani.supersaver.service;

import com.joselu_dani.supersaver.dto.UserDto;
import com.joselu_dani.supersaver.model.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    User findByName(String name);

    List<UserDto> findAllUsers();
}

