package com.educandoweb.curso.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.educandoweb.curso.entities.User;
import com.educandoweb.curso.repositories.UserRepository;
import java.util.Optional;

@Service // registra classe como componente do spring e pode ser injetado automaticamente
         // @Autowired
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> fidAll() { // metodo retorna todos os usuarios do banco de dados
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.get();

    }
}
