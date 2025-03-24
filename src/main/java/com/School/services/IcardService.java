package com.School.services;

import com.School.entities.Icard;
import com.School.entities.Subjects;
import com.School.repository.IcardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class IcardService {

    @Autowired
    IcardRepository icardRepository;

    public List<Icard> getAllIcards(){
        return icardRepository.findAll();
    }

    public Icard addIcard(Icard icard){
        return icardRepository.save(icard);
    }
}
