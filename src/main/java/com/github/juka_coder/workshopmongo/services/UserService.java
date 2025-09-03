package com.github.juka_coder.workshopmongo.services;

import com.github.juka_coder.workshopmongo.DTO.UserDTO;
import com.github.juka_coder.workshopmongo.domain.User;
import com.github.juka_coder.workshopmongo.repository.UserRepository;
import com.github.juka_coder.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }

    public User findById(String id){
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    public User insert(User obj){
        return repo.insert(obj);
    }

    public User fromDTO(UserDTO objDto){
        return new User(objDto.getName(),objDto.getId(), objDto.getEmail());
    }
}
