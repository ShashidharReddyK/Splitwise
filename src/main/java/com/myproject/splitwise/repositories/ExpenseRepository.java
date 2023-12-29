package com.myproject.splitwise.repositories;

import com.myproject.splitwise.Models.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense,Long> {
}
