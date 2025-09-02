package com.github.juka_coder.workshopmongo.services;

import com.github.juka_coder.workshopmongo.domain.User;
import com.github.juka_coder.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAl(){
        return repo.findAll();
    }
}
