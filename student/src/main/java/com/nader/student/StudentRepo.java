package com.nader.student;

import com.nader.student.dao.Student;
import com.nader.student.dao.StudentDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Long> {
    List<StudentDTO> findAllBySchoolId(long schoolId);
}
