package com.eykelf.ancestry.rest.controller;


import com.eykelf.ancestry.entites.Person;
import com.eykelf.ancestry.repo.PersonRepo;
import com.eykelf.ancestry.rest.entities.RestPerson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    
    @Autowired
    PersonRepo repo;

    @GetMapping("/person")
    public RestPerson getPerson(@RequestParam(value = "name") String name) {
        Person person = repo.findByName(name);
        System.out.println("getPerson");
        System.out.println(person);

        return new RestPerson(
            person.name, 
            person.familyname, 
            person.birthday, 
            person.deathDate);

    }

}
