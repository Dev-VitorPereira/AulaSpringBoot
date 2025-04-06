package com.aulaspringboot.AulaSpringBoot.controller;

import com.aulaspringboot.AulaSpringBoot.entities.User;
import com.aulaspringboot.AulaSpringBoot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  // Informa ao Spring que esta classe é um controlador REST — ou seja, retornará dados (JSON, XML etc.), não views.
@RequestMapping("/users") // Define o caminho base dos endpoints: todos começam com "/users"

public class UserController {

    @Autowired // Injeta automaticamente uma instância do UserRepository (injeção de dependência)
    private UserRepository repository;

    @GetMapping
    public List<User> findAll(){
       List <User> result = repository.findAll();
       return result;
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable //anotação usada em Spring Boot para extrair valores da URL
                             Long id){
        User result = repository.findById(id).get();
        return result;
    }
    @PostMapping
    public User insert(@RequestBody //deserializa automaticamente o corpo da requisição (geralmente em JSON) para um objeto Java.
                           User user){
        User result = repository.save(user);
        return result;
    }
}
