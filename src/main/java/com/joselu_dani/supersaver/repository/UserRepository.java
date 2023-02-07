package com.joselu_dani.supersaver.repository;

import com.joselu_dani.supersaver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findById(long id);
    User findByEmail(String email);
    User findByName(String name);
}
