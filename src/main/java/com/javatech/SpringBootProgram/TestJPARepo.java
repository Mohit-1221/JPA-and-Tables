package com.javatech.SpringBootProgram;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestJPARepo extends JpaRepository<Student,Integer> {
    List<Student> findByAge(int age);

    List<Student> findByAgeAndGender(int age, String gender);

    //@Query(value = "Select * from student_info as s where s.age > :age",nativeQuery = true) // for sql table
    @Query(value = "Select s from Student s where s.age > :age",nativeQuery = false)   //for spring boot object
    List<Student> getAllByAgeGreaterThan(int age);
}
