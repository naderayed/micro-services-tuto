package com.nader.school;

import java.util.List;

public record FullSchoolResponse(
        long id,
        String name,
        String email,
        List<Students> student

) {
}
