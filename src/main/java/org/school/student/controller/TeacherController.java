package org.school.student.controller;

import org.school.student.entity.Teacher;
import org.school.student.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    TeacherRepository teacherRepository;

    @GetMapping(value = "/teacher",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Teacher> teacherList(){

        return  teacherRepository.findAll();
    }

    @PostMapping(path = "/teacher/create",produces = MediaType.APPLICATION_JSON_VALUE)
    public Teacher addTeacher(@RequestBody Teacher teacher)
    {
        System.out.println(teacher);

        return  teacherRepository.save(teacher);
    }
}
