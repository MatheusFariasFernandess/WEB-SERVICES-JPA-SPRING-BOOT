package com.example.jpa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.jpa.models.*;
import com.example.jpa.repository.UserRepository;
import java.util.List;
import jakarta.xml.ws.Response;
import com.example.jpa.models.*;

@RestController
@RequestMapping("/users")
public class UserController {

     @Autowired
     UserRepository user;
     
     @GetMapping
     public List<UserModel>findAll(){
          return user.findAll();
     }    

     @PostMapping
     public void saveUser(@RequestBody UserModel user){
          this.user.save(user);
     }


}
