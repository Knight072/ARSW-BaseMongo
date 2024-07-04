package com.example.accessing_data_mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccessingDataMongodbApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataMongodbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of customers
		repository.save(new Student("Juan", 18, "juan@gmail.com"));
		repository.save(new Student("Santiago", 22, "santiago@hotmail.com"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Student student : repository.findAll()) {
			System.out.println(student);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByName('Juan'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByNombre("Alice"));

		System.out.println("Customers found with findByEdad('18'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByEdad(18));


		System.out.println("Customers found with findByCorreo('santiago@hotmail.com'):");
		System.out.println("--------------------------------");
		for (Student student : repository.findByCorreo("santiago@hotmail.com")) {
			System.out.println(student);
		}

	}

}
