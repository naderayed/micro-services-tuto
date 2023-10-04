package com.nader.school;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/schools")
public class SchoolController {

    private final SchoolService schoolService ;

    @PostMapping
    public void save(School school){
        schoolService.addSchool(school);
    }
    @GetMapping
    public List<School> getAllSchools(){
        return schoolService.getAllSchool();
    }
}
