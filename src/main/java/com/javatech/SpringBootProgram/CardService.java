package com.javatech.SpringBootProgram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    @Autowired
    LibraryCardRepo libraryCardRepo;

    public void saveCard(LibraryCard card){
        libraryCardRepo.save(card);
    }
}
