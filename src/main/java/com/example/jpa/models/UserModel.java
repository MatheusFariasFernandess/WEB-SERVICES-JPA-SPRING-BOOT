package com.example.jpa.models;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.core.SerializableString;
import java.io.*;
import jakarta.persistence.*;

@Entity
public class UserModel implements Serializable{

    private static final Long serialVersionUID = 1L;

    @Id
    @Column(nullable = false)
    private Integer id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    
    private String email;
    
    @Column(nullable = false)
    private String phone;
    
    @Column(nullable = false)
    private String password;
    
    public UserModel(Integer id,String name,String email,String phone,String password) {
        this.email=email;
        this.id=id;
        this.name=name;
        this.phone=phone;
        this.password=password;
    }

    public UserModel(){}

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this){
            UserModel other = (UserModel) obj; 
            return id.equals(other.id);
        }else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    
}
