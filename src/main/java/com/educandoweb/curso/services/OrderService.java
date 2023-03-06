package com.educandoweb.curso.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.educandoweb.curso.entities.Order;
import com.educandoweb.curso.repositories.OrderRepository;
import java.util.Optional;

@Service // registra classe como componente do spring e pode ser injetado automaticamente
         // @Autowired
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> fidAll() { // metodo retorna todos os usuarios do banco de dados
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();

    }
}
