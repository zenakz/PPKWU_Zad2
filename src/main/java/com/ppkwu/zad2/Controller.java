package com.ppkwu.zad2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/stringInfo")
    public String stringInfo(@RequestBody String string){
        String returnValue = countStringCharacters(string);
        return returnValue;
    }

    public String countStringCharacters(String string){
        return string;
    }
}
