package com.javatech.SpringBootProgram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    TestJPARepo repo;

    public String saveStudent(Student student) {
        repo.save(student);
        return "Saved Successfully";
    }

    public Student getStudentById(int id) {
        return repo.findById(id).get();
    }
}
