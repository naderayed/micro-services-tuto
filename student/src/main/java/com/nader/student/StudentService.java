package com.nader.student;

import com.nader.student.dao.StudentDTO;

import java.util.List;

public interface StudentService {

    void  saveStudent(StudentDTO studentDTO);
    List<StudentDTO> findAllStudent();
}
