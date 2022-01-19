package com.eykelf.ancestry.repo;

import com.eykelf.ancestry.entites.Person;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends MongoRepository<Person, String> {

    public Person findByName(String name);
    
}
