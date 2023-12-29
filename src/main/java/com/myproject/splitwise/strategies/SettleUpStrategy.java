package com.myproject.splitwise.strategies;

import com.myproject.splitwise.Models.Expense;

import java.util.List;

public interface SettleUpStrategy {

    public List<Expense> settleUp(List<Expense> expensestoSettleUp);
}
