package com.example.jpa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.jpa.models.*;

import jakarta.xml.ws.Response;

@RestController
@RequestMapping("/users")
public class UserController {

     
     @GetMapping
     public ResponseEntity<UserModel>findAll(){
          UserModel user = new UserModel(1,"Matheus","asdasd","asdfadf","dadasd");
         
          return ResponseEntity.ok().body(user);

     }
}
