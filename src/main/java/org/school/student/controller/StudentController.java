package org.school.student.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping(value = "/",produces = MediaType.TEXT_PLAIN_VALUE)
    public String studentList(){

        return "List of Students";
    }

}
