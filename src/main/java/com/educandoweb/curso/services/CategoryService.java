package com.educandoweb.curso.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.educandoweb.curso.entities.Category;
import com.educandoweb.curso.repositories.CategoryRepository;
import java.util.Optional;

@Service // registra classe como componente do spring e pode ser injetado automaticamente
         // @Autowired
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> fidAll() { // metodo retorna todos os usuarios do banco de dados
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();

    }
}
