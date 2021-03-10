package org.school.student.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping(value = "/users",produces = MediaType.APPLICATION_JSON_VALUE)
    public String userList(){

        return "List of Users";
    }
}
