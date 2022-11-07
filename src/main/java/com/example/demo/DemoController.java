package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public String demo(){
        return "Hello there";
    }

    @GetMapping("/persons")
    public Person getPerson(){
        return new Person(1,"Emelie", 27, "Lönsboda");
    }

    @GetMapping("/persons/{id}")
    public Person getOnePerson(@PathVariable int id){
        return new Person(id,"Johan", 164, "Fågelfors");

    }

    @PostMapping("/persons")
        public String addPerson(@RequestBody Person person){
            return person.toString();
        }
    

    @GetMapping("/sorting")
    public String demoSorting(@RequestParam String sort){
        return sort;
    }




}
