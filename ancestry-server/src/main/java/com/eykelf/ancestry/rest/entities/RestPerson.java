package com.eykelf.ancestry.rest.entities;

import java.util.Date;

public class RestPerson {
    public String name;
    public String familyname;
    public Date birthday;
    public Date deathDate;
    
    public RestPerson(String name, String familyname, Date birthday, Date deathDate) {
        this.name = name;
        this.familyname = familyname;
        this.birthday = birthday;
        this.deathDate = deathDate;
    }

    public String getName() {
        return name;
    }

    public String getFamilyname() {
        return familyname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Date getDeathDate() {
        return deathDate;
    }
    
}
