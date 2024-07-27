package com.javatech.SpringBootProgram;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryCardRepo extends JpaRepository<LibraryCard, Integer>{
}
