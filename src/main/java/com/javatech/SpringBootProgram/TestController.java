package com.javatech.SpringBootProgram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class TestController {
    @Autowired
    TestService service;

    @PostMapping("/insert")
    public String saveStudent(@RequestBody Student student, @RequestParam("department") Department department) {
        return service.saveStudent(student, department);
    }

    @GetMapping("/get/{id}")
    public Student getStudentById(@PathVariable int id) {
        return service.getStudentById(id);
    }

    @DeleteMapping("/delete")
    public String deleteStudentById(@RequestParam("id") int id){
        return service.deleteStudentById(id);
    }

    @GetMapping("/get_by_age")
    public List<String> getAllByAge(@RequestParam("age") int age){
        return service.getAllByAge(age);
    }

    @GetMapping("/get_by_age_gender")
    public List<String> getAllByAgeAndGender(@RequestParam("age") int age, @RequestParam("gender") String gender){
        return service.getAllByAgeAndGender(age,gender);
    }

    @GetMapping("/get_by_age_greater")
    public List<String> getAllByAgeGreaterThan(int age){
        return service.getAllByAgeGreaterThan(age);
    }
}
