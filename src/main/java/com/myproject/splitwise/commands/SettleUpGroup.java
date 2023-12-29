package com.myproject.splitwise.commands;

import com.myproject.splitwise.controllers.SettleUpController;
import com.myproject.splitwise.dtos.SettleUpGroupRequestDto;
import com.myproject.splitwise.dtos.SettleUpGroupResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SettleUpGroup implements Command{
    /*
    Expected Input
    SettleUpGroup <groupId>
     */

    SettleUpController settleUpController;

    @Autowired
    public SettleUpGroup(SettleUpController settleUpController){
        this.settleUpController = settleUpController;
    }

    @Override
    public void execute(String input) {
        List<String> words = List.of(input.split(" "));
        Long groupId = Long.valueOf(words.get(1));

        SettleUpGroupRequestDto settleUpGroupRequestDto = new SettleUpGroupRequestDto();
        settleUpGroupRequestDto.setGroupId(groupId);

        SettleUpGroupResponseDto settleUpGroupResponseDto =
                settleUpController.settleUpGroup(settleUpGroupRequestDto);

    }

    @Override
    public boolean matches(String input) {
        List<String> words = List.of(input.split(" "));


        return words.size() == 2 && words.get(1).equalsIgnoreCase(CommandKeywords.SettleUpGroup);
    }
}
