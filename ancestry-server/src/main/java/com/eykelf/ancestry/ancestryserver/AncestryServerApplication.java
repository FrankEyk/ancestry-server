package com.eykelf.ancestry.ancestryserver;

import java.text.SimpleDateFormat;
import java.util.List;

import com.eykelf.ancestry.entites.Person;
import com.eykelf.ancestry.repo.PersonRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan("com.eykelf.ancestry")
@EnableMongoRepositories("com.eykelf.ancestry")
public class AncestryServerApplication implements CommandLineRunner {

	@Autowired
	public PersonRepo personRepo;

	public static void main(String[] args) {
		SpringApplication.run(AncestryServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("start");
		personRepo.deleteAll();

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Person person = new Person("Frank", "Eykelhoff", format.parse( "1980-05-08" ), null);
		personRepo.save(person);

		final List<Person> all = personRepo.findAll();
		System.out.println(all);
		System.out.println(all.get(0));
		System.out.println(personRepo.findByName(all.get(0).name));

		Person savedPerson = all.get(0);
		savedPerson.deathDate = format.parse("2023-02-01");
		Person save = personRepo.save(savedPerson);
		System.out.println(save);
		System.out.println("finish");
	}

}
