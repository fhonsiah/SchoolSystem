package org.school.student.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "teachers")
public class Teacher implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "first_name",nullable = false)
    private  String firstName;

    @Column(name = "second_name",nullable = false)
    private  String lastName;

    @JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
    @OneToMany(mappedBy = "teacher",fetch = FetchType.LAZY,
               cascade = CascadeType.ALL)
    private Set<Subject> subjects;





}
