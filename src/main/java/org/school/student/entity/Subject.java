package org.school.student.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "subjects")
public class Subject implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @JsonManagedReference
    @JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "teacher_id",nullable = false)
    private  Teacher teacher;







}
