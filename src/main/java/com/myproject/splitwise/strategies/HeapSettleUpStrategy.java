package com.myproject.splitwise.strategies;

import com.myproject.splitwise.Models.Expense;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HeapSettleUpStrategy implements SettleUpStrategy{

    @Override
    public List<Expense> settleUp(List<Expense> expensestoSettleUp) {
        return null;
    }
}
