package com.example.accessing_data_mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/data")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @GetMapping("")
    public List<Student> getData(){
        return studentRepository.findAll();
    }

    @PostMapping("/add")
    public void AddStudent(@RequestBody Student student){
        studentRepository.save(student);
    }

}
