package org.school.student.controller;


import org.school.student.entity.Pet;
import org.school.student.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PetController {

    @Autowired
    PetRepository petRepository;

    @GetMapping(value = "/pet",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getPets(){
      List<Pet> pets = petRepository.findAll();
      if(pets.isEmpty()){
          return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
      }
      else {
        return new ResponseEntity<>(pets,HttpStatus.OK);
      }

    }

    @PostMapping(value = "/pet/create",produces = MediaType.APPLICATION_JSON_VALUE)
    public Pet savePet(@RequestBody Pet pet){

        return petRepository.save(pet);
    }


}


