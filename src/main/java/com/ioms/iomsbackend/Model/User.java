package com.ioms.iomsbackend.Model;


import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;
import java.util.UUID;


@Entity
@Table(name = "user")
public class User {

    // instance variable
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  userId;
    private String name;
    @Column(unique = true)
    private String email;

    private boolean logIn;
    // useing enum to specify set of constants
    private enum role {
        Admin,Manager,Viewer
    }


    // constructors

    public User(){}

    public User(Long userId, String name, String email, boolean logIn) {
        this.userId = userId;
        this.name = name;

        this.email = email;
        this.logIn = logIn;

    }
    // getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public boolean isLogIn() {
        return logIn;
    }

    public void setLogIn(boolean logIn) {
        this.logIn = logIn;
    }

//    public List<Product> getProduct() {
//        return product;
//    }
//
//    public void setProduct(List<Product> product) {
//        this.product = product;
//    }
}
