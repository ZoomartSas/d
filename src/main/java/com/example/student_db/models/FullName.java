package com.example.student_db.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)

public class FullName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String fullName;

    @ManyToOne
    Gender gender;

    @ManyToOne
    Faculry faculry;
    @ManyToOne
    School school;
    @ManyToOne
    Courses courses;
}
