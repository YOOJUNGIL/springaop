package com.myalley.springbuild.controller.api;

import com.myalley.springbuild.dao.dto.Person;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ApiController {

    @GetMapping("/api/index")
    public String index(Model model, @RequestParam String name) {
        return "hello, " + name;
    }

    @GetMapping("/api/json")
    public Person json(Person person) {
        return person;
    }
    
    @GetMapping("/api/map")
    public HashMap<String, Object> map(@RequestParam HashMap<String, Object> map) {
        return map;
    }

}
