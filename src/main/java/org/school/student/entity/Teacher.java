package org.school.student.entity;

import javax.persistence.*;

@Entity
@Table(name = "teachers")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "first_name",nullable = false)
    private  String firstName;

    @Column(name = "second_name",nullable = false)
    private  String lastName;

    @Column(name = "subject_name",nullable = false)
    private  String subject;

}
