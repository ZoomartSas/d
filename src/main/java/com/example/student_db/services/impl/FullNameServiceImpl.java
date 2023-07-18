package com.example.student_db.services.impl;

import com.example.student_db.models.FullName;
import com.example.student_db.repos.FullNameRepository;
import com.example.student_db.services.FullNameService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FullNameServiceImpl implements FullNameService {
    private final FullNameRepository fullNameRepo;

    public FullNameServiceImpl(FullNameRepository fullNameRepo) {
        this.fullNameRepo = fullNameRepo;
    }

    @Override
    public List <FullName> findByName(String fullName) {
        return fullNameRepo.findByFullNameIsLike(fullName+"%") ;
    }
    @Override
    public List <FullName> findByName2(String fullName) {
        return fullNameRepo.findByFN(fullName+"%") ;
    }

    @Override
    public List <FullName> findByName3(String fullName) {
        return fullNameRepo.findByFNJpql(fullName+"%") ;
    }
}
