package com.example.student_db.services.impl;

import com.example.student_db.models.FullName;
import com.example.student_db.repos.FullNameRepository;
import com.example.student_db.services.FullNameService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.GregorianCalendar;
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

    @Override
    public List<FullName> findByBirth(int birthYear) {

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(Math.toIntExact(birthYear),1,1);
        System.err.println("calend"+calendar.getTime());
        LocalDate localDate = LocalDate.of(birthYear, Month.JANUARY,1);
        System.err.println("localdate "+ localDate);




        return fullNameRepo.findByDateAfter(localDate);
    }
}
