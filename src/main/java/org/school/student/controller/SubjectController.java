package org.school.student.controller;

import org.school.student.entity.Subject;
import org.school.student.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubjectController {

    @Autowired
    SubjectRepository subjectRepository;

    @PostMapping(value = "/subject/create",produces = MediaType.APPLICATION_JSON_VALUE)
    public Subject createSubject(@RequestBody Subject subject){

        return subjectRepository.save(subject);
    }
}
