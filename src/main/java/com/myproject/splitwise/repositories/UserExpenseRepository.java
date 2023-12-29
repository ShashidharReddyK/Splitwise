package com.myproject.splitwise.repositories;

import com.myproject.splitwise.Models.UserExpense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserExpenseRepository extends JpaRepository<UserExpense, Long> {

}
