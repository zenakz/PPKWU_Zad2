package com.ppkwu.zad2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {

    @GetMapping("/stringInfo")
    public String stringInfo(@RequestBody String string){
        String returnValue = countStringCharacters(string);
        return returnValue;
    }

    public String countStringCharacters(String string){
        List<Integer> charactersList = new ArrayList<>(Arrays.asList(0,0,0,0)); //small letters/big letters/numbers/special characters
        for (int i = 0; i < string.length(); i++){
            char c = string.charAt(i);
            if(Character.isLowerCase(c))charactersList.set(0,charactersList.get(0) + 1);
            else if(Character.isUpperCase(c))charactersList.set(1,charactersList.get(1) + 1);
            else if(Character.isDigit(c))charactersList.set(2,charactersList.get(2) + 1);
            else charactersList.set(3,charactersList.get(3) + 1);
        }

        return "Lower case character count: " + charactersList.get(0) + "\n" +
                "Upper case character count: " + charactersList.get(1) + "\n" +
                "Digits count: " + charactersList.get(2) + "\n" +
                "Special characters count: " + charactersList.get(3);
    }
}
