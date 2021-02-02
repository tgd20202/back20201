package com.openjournal.backrevista.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Editores {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CORREO_ELECTRONICO",unique = true)
    private String email;

    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private List<ROLES> roles;

    @OneToMany(mappedBy = "editores",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Revistas> revistas;
}
