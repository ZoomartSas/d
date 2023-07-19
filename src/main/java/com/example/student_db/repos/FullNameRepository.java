package com.example.student_db.repos;

import com.example.student_db.models.FullName;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface FullNameRepository extends JpaRepository<FullName, Long> {
    List<FullName> findByFullNameIsLike(String fullName);


    @Query(value = "select * from  full_name where full_name like :name "
            , nativeQuery = true)
    List<FullName> findByFN(String name);

    @Query(value = "select f from FullName f where f.fullName like :name"
            , nativeQuery = false)
    List<FullName> findByFNJpql(String name);

//    List<FullName> findByDataBofAfter(LocalDate date);

    @Query(value = "select * from full_name join data_bof  on data_bof.id = full_name.data_bof_id  and data_bof.date >= '1981-01-01'"
            ,nativeQuery = true)
    List<FullName> findByBirth(@Value("date") LocalDate date);


    @Query(value = "SELECT * FROM full_name " +
            "JOIN data_bof ON data_bof.id = full_name.data_bof_id " +
            "WHERE data_bof.date >= :startDate", nativeQuery = true)
    List<FullName> findByDateAfter(@Param("startDate") LocalDate startDate);
}
