package com.example.student_db.services;

import com.example.student_db.models.FullName;

import java.util.List;

public interface FullNameService {

   List<FullName> findByName(String fullName);

   List <FullName> findByName2(String fullName);

   List <FullName> findByName3(String fullName);
}
