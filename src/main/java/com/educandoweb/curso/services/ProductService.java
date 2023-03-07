package com.educandoweb.curso.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.educandoweb.curso.entities.Product;
import com.educandoweb.curso.repositories.ProductRepository;
import java.util.Optional;

@Service // registra classe como componente do spring e pode ser injetado automaticamente
         // @Autowired
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> fidAll() { // metodo retorna todos os usuarios do banco de dados
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();

    }
}
