package com.javatech.SpringBootProgram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestService {
    @Autowired TestJPARepo repo;

    public String saveStudent(Student student, Department department) {
        LibraryCard card = new LibraryCard();
        card.setDepartment(department);
        card.setStudent(student);

        student.setLibraryCard(card);

        repo.save(student);
        return "Saved Successfully";
    }

    public Student getStudentById(int id) {
        return repo.findById(id).get();
    }

    public String deleteStudentById(int id) {
        repo.deleteById(id);
        return "Student Deleted Successfully";
    }

    public List<String> getAllByAge(int age) {
        List<Student> students = repo.findByAge(age);
        List<String > studentList = new ArrayList<>();
        for(Student student : students){
            studentList.add(student.getName());
        }
        return studentList;
    }

    public List<String> getAllByAgeAndGender(int age, String gender) {
        List<Student> students = repo.findByAgeAndGender(age,gender);
        List<String> studentList = new ArrayList<>();
        for(Student student : students){
            studentList.add(student.getName());
        }
        return studentList;
    }

    public List<String> getAllByAgeGreaterThan(int age) {
        List<Student> students = repo.getAllByAgeGreaterThan(age);
        List<String> studentList = new ArrayList<>();
        for(Student student : students){
            studentList.add(student.getName());
        }
        return studentList;
    }
}
