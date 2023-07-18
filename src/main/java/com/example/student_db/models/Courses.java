package com.example.student_db.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Boolean YON;

}
