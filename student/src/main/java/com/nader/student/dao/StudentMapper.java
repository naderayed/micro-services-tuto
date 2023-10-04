package com.nader.student.dao;


import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class StudentMapper implements Function<StudentDTO, Student> {

    @Override
    public Student apply(StudentDTO studentDTO) {
        return Student.builder()
                .email(studentDTO.email())
                .firstname(studentDTO.firstname())
                .id(studentDTO.id())
                .lastname(studentDTO.lastname())
                .schoolId(studentDTO.schoolId())
                .build();
    }
}
