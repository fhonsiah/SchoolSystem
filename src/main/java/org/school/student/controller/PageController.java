package org.school.student.controller;

import org.school.student.entity.Page;
import org.school.student.repository.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PageController {

    @Autowired
    PageRepository pageRepository;

    @GetMapping(value = "/page",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Page> getPages(){

        return pageRepository.findAll();
    }

    @PostMapping(value= "/page/create",produces = MediaType.APPLICATION_JSON_VALUE)
    public Page savePage(@RequestBody Page page){

        return pageRepository.save(page);
    }
}