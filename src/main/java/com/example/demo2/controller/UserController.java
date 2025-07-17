package com.example.demo2.controller;


import com.example.demo2.entity.Users;
import com.example.demo2.service.UserService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/users")
public class UserController {

    private  final UserService userService;

    @PostMapping
    public ResponseEntity<Users> createUsers(@RequestBody Users users){
        Users createUsers= userService.createUser(users);
        return ResponseEntity.status(HttpStatus.CREATED).body(createUsers);
    }

    @GetMapping
    public ResponseEntity<List<Users>> getUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }
}
