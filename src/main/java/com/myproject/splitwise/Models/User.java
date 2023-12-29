package com.myproject.splitwise.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User extends BaseModel{

    private String name;

    private Long phone;

    private String password;
}
