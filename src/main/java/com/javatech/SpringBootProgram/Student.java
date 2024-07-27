package com.javatech.SpringBootProgram;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="student_info")
public class Student {
    @Column(name="full_ name")
    private String name;
    @Id
    private int id;
    private String gender;
    private String email;

}
