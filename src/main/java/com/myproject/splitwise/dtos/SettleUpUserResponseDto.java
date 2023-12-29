package com.myproject.splitwise.dtos;

import com.myproject.splitwise.Models.Expense;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SettleUpUserResponseDto {
    private List<Expense> expenses;
}
