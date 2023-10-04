package com.nader.student.dao;

public record StudentDTO(long id ,
                         String firstname,
                         String lastname,
                         String email,
                         long schoolId
) {
}
