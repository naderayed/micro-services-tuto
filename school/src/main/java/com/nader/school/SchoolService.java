package com.nader.school;

import com.nader.school.client.StudentClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepo repo;
    private final  StudentClient client;

    void addSchool(School school){
        repo.save(school);
    }
    public List<School> getAllSchool(){
        return  repo.findAll();
    }

    public FullSchoolResponse  getschoolWithStudents(long schoolId) {

        School school = repo.findById(schoolId).orElse(
                School
                .builder()
                .name("fakeSchool")
                .build());

        var studnets = client.findAllStudentsByschoold(schoolId);
        return new FullSchoolResponse(
                school.getId()
                ,school.getName()
                ,school.getEmail()
                ,studnets

        );
    }
}
