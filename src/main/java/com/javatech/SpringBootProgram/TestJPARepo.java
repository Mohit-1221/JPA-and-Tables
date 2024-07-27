package com.javatech.SpringBootProgram;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestJPARepo extends JpaRepository<Student,Integer> {
//    public Student findbyName(String name);
}
