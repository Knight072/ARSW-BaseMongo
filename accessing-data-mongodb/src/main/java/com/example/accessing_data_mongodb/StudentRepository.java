package com.example.accessing_data_mongodb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {

    Student findByNombre(String nombre);
    Student findByEdad(Integer edad);
    List<Student> findByCorreo(String correo);


}
