package com.eykelf.ancestry.entites;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Person entity. 
 */
@Document(collection = "persons")
public class Person {
    
    @Id
    public String id;

    public String name;
    public String familyname;
    public Date birthday;
    public Date deathDate;
    
    public Person() {
    }

    public Person(String name, String familyname, Date birthday, Date deathDate) {
        this.name = name;
        this.familyname = familyname;
        this.birthday = birthday;
        this.deathDate = deathDate;
    }

    @Override
    public String toString() {
        return "Person [birthday=" + birthday + ", deathDate=" + deathDate + ", familyname=" + familyname + ", id=" + id
                + ", name=" + name + "]";
    }

}
