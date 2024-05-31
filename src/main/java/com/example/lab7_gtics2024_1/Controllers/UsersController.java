package com.example.lab7_gtics2024_1.Controllers;

import com.example.lab7_gtics2024_1.Entitys.Users;
import com.example.lab7_gtics2024_1.Repositorys.UsersRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {
    final UsersRepository usersRepository;

    public UsersController(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    @GetMapping("/user")
    public List<Users> listarUsuarios(){
        return usersRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public Users obtenerUsuario(@PathVariable ("id") String idStr){
        return null;
    }

}
