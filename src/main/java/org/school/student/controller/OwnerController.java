package org.school.student.controller;

import org.school.student.entity.Owner;
import org.school.student.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OwnerController {

    @Autowired
    OwnerRepository ownerRepository;

    @GetMapping(value = "/owner",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Owner> getOwner(){

        return ownerRepository.findAll();
    }

    @PostMapping(value = "/owner/create",produces = MediaType.APPLICATION_JSON_VALUE)
    public Owner saveOwner(@RequestBody Owner owner){

        return ownerRepository.save(owner);
    }
}
