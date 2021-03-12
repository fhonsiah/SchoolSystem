package org.school.student.controller;

import org.school.student.entity.Subject;
import org.school.student.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SubjectController {

    @Autowired
    SubjectRepository subjectRepository;

    @PostMapping(value = "/subject/create",produces = MediaType.APPLICATION_JSON_VALUE)
    public Subject createSubject(@RequestBody Subject subject){

        return subjectRepository.save(subject);
    }
    @GetMapping(value = "/subjects",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Subject> subjectList(){

        return subjectRepository.findAll();
    }

    @GetMapping(value = "/subject/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Subject> getSubjectById(@PathVariable("id") int id){

        return subjectRepository.findById(id);

    }

    @DeleteMapping(value = "/subject/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteSubjectById(@PathVariable("id") int id){
        subjectRepository.deleteById(id);

    }
}
