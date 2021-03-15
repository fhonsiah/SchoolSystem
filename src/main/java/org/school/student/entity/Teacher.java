package org.school.student.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Teacher implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "first_name",nullable = false)
    private  String firstName;

    @Column(name = "second_name",nullable = false)
    private  String lastName;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "subject_id",nullable = false)
    private Subject subjects;





}
