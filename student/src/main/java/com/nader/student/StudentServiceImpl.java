package com.nader.student;


import com.nader.student.dao.Student;
import com.nader.student.dao.StudentDTO;
import com.nader.student.dao.StudentDTOMappper;
import com.nader.student.dao.StudentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepo repo ;
    private final StudentMapper studentMapper;
    private final StudentDTOMappper studentDTOMapper;


    @Override
    public void saveStudent(StudentDTO studentDTO) {
        Student student = Optional.of(studentDTO)
                .map(studentMapper)
                .orElseThrow(() -> new RuntimeException("could not map the student"));
        repo.save(student);

    }

    @Override
    public List<StudentDTO> findAllStudent() {
       return repo.findAll().stream().map(studentDTOMapper).toList();

    }
}
