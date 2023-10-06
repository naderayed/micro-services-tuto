package com.nader.student;


import com.nader.student.dao.StudentDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/students")
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent
            (@RequestBody StudentDTO studentDTO){
         studentService.saveStudent(studentDTO);
    }
    @GetMapping
    public ResponseEntity<List<StudentDTO>> getAllStudent(){
        return ResponseEntity.ok(studentService.findAllStudent());
    }

    @GetMapping("school/{school-id}")
    public ResponseEntity<List<StudentDTO>> getAllStudent(@PathVariable("school-id") long schoolId){
        return ResponseEntity.ok(studentService.findAllStudentBySchool(schoolId));
    }
}
