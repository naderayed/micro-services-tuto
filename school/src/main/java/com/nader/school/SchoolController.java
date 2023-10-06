package com.nader.school;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/schools")
public class SchoolController {

    private final SchoolService schoolService;

    @PostMapping
    public void save(@RequestBody School school) {
        schoolService.addSchool(school);
    }

    @GetMapping
    public List<School> getAllSchools() {
        return schoolService.getAllSchool();
    }

    @GetMapping("/students")
    public FullSchoolResponse getAllSchools(@RequestParam long schoolId) {
        return schoolService.getschoolWithStudents(schoolId);
    }
}
