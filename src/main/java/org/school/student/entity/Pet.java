package org.school.student.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pets")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private  String pet_type;

//    @ManyToOne(fetch = FetchType.LAZY,optional = false)
//    @JoinColumn(name = "owner_id",nullable = false)
//    private Pet pet;
}
