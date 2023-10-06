package com.nader.school.client;

import com.nader.school.Students;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="student-service", url = "${application.config.students-url}")
public interface StudentClient {
    @GetMapping("school/{school-id}")
    List<Students> findAllStudentsByschoold(@PathVariable("school-id") long schoolId);
}
