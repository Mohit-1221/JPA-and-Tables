package com.javatech.SpringBootProgram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class TestController {
    @Autowired
    TestService service;

    @PostMapping("/insert")
    public String saveStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    @GetMapping("/get/{id}")
    public Student getStudentById(@PathVariable int id) {
        return service.getStudentById(id);
    }

}
