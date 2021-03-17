package org.school.student.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "owners")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String firstName;

    private String lastName;


//    @OneToMany(mappedBy = "owner",fetch = FetchType.LAZY,
//               cascade = CascadeType.ALL)
//    private Set<Pet> pets;


}
