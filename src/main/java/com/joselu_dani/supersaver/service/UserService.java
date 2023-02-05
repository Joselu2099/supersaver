package com.joselu_dani.supersaver.service;

import com.joselu_dani.supersaver.model.User;
import com.joselu_dani.supersaver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(long id){
        return userRepository.findById(id);
    }

    public User findByEmail(String name){
        return userRepository.findByEmail(name);
    }

}
