package com.myproject.splitwise.commands;

import com.myproject.splitwise.controllers.SettleUpController;
import com.myproject.splitwise.dtos.SettleUpUserRequestDto;
import com.myproject.splitwise.dtos.SettleUpUserResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SettleUpUser implements Command{

    /* Expected Input : SettleUp <user_Id> */
    @Autowired
    private SettleUpController settleUpController;


    public SettleUpUser(SettleUpController settleUpController){
        this.settleUpController = settleUpController;
    }
    @Override
    public boolean matches(String input) {
        List<String> words = List.of(input.split(" "));

        return words.size() == 2 && words.get(0).equalsIgnoreCase(CommandKeywords.SettleUpUser);
    }

    @Override
    public void execute(String input) {
        List<String> words = List.of(input.split(" "));

        SettleUpUserRequestDto settleUpUserRequestDto = new SettleUpUserRequestDto();
        settleUpUserRequestDto.setUserId(Long.valueOf(words.get(1)));

        SettleUpUserResponseDto responseDto = settleUpController.settleUpUser(settleUpUserRequestDto);

    }
}
