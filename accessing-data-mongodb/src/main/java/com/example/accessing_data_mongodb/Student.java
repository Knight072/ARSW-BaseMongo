package com.example.accessing_data_mongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("student")
public class Student {

    @Id
    public String id;

    public String nombre;
    public Integer edad;
    public String correo;

    public Student() {}

    public Student(String nombre, Integer edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return String.format(
                "Student[id=%s, nombre='%s', edad='%s', correo='%s']",
                id, nombre, edad, correo);
    }

}
