package com.myproject.splitwise.repositories;

import com.myproject.splitwise.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
