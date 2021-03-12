package org.school.student.controller;

import org.school.student.entity.Student;
import org.school.student.entity.Teacher;
import org.school.student.repository.StudentRepository;
import org.school.student.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping(value = "/student",produces = MediaType.TEXT_PLAIN_VALUE)
    public String studentList(){

        return "List of Students";
    }

    @PostMapping(path = "/student/create",produces = MediaType.APPLICATION_JSON_VALUE)
    public Student addStudent(@RequestBody Student student)
    {
        System.out.println(student);

        return studentRepository.save(student);
    }


}
