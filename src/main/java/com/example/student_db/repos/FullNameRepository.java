package com.example.student_db.repos;

import com.example.student_db.models.FullName;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FullNameRepository extends JpaRepository<FullName,Long> {
   List <FullName> findByFullNameIsLike(String fullName);


   @Query(value = "select * from  full_name where full_name like :name "
           ,nativeQuery = true)
   List <FullName> findByFN(String name);

   @Query(value = "select f from FullName f where f.fullName like :name"
           ,nativeQuery = false)
   List <FullName> findByFNJpql(String name);

}
