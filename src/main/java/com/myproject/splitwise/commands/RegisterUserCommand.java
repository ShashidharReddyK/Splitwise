package com.myproject.splitwise.commands;

import java.util.List;

public class RegisterUserCommand implements Command{

    /* Expected Input:
      Registeruser <username> <Phone> <password>
     */
    @Override
    public void execute(String input) {

    }

    @Override
    public boolean matches(String input) {
        List<String> words = List.of(input.split(" "));


        return words.size() == 4 && words.get(0).equalsIgnoreCase(CommandKeywords.RegisterUser);
    }
}
