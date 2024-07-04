package com.example.accessing_data_mongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("student")
public class Student {

    @Id
    public String id;

    public String nombre;
    public Integer edad;
    public Date fechaNacimiento;
    public String correo;

    public Student() {}

    public Student(String nombre, Integer edad, String correo, Date fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return String.format(
                "Student[id=%s, nombre='%s', edad='%s', correo='%s, fechaNacimiento='%s'']",
                id, nombre, edad, correo, fechaNacimiento);
    }

}
