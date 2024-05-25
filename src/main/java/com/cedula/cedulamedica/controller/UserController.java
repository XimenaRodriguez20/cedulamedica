package com.cedula.cedulamedica.controller;

import com.cedula.cedulamedica.entity.User;
import com.cedula.cedulamedica.repository.UserMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserMongoRepository userMongoRepository1;

    @RequestMapping("/auth")
    public String createUser(){
        return "Pagina Protegida";
    }

    @RequestMapping("/noauth")
    public String createUser2(){
        return "Pagina sin proteccion";
    }
    @GetMapping("/User")
    public List<User> getUsers(){
        return userMongoRepository1.findAll();
    }



}
