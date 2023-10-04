package com.nader.student.dao;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class StudentDTOMappper implements Function<Student, StudentDTO> {

    @Override
    public StudentDTO apply(Student student) {
        return new StudentDTO(
                student.getId(),
                student.getFirstname(),
                student.getLastname(),
                student.getEmail(),
                student.getSchoolId()
                );
    }
}
