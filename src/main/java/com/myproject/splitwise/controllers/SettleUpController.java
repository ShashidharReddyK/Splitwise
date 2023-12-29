package com.myproject.splitwise.controllers;

import com.myproject.splitwise.dtos.SettleUpGroupRequestDto;
import com.myproject.splitwise.dtos.SettleUpGroupResponseDto;
import com.myproject.splitwise.dtos.SettleUpUserRequestDto;
import com.myproject.splitwise.dtos.SettleUpUserResponseDto;
import org.springframework.stereotype.Controller;

@Controller
public class SettleUpController {
    public SettleUpController(){
    }
    public SettleUpUserResponseDto settleUpUser(SettleUpUserRequestDto settleUpUserRequestDto){
        return null;
    }

    public SettleUpGroupResponseDto settleUpGroup(SettleUpGroupRequestDto settleUpGroupRequestDto){
        return null;
    }
}
