package com.nader.school;

import com.nader.school.School;
import com.nader.school.SchoolRepo;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepo repo;

    void addSchool(School school){
        repo.save(school);
    }
    public List<School> getAllSchool(){
        return  repo.findAll();
    }

}
