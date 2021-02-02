package com.openjournal.backrevista.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Revistas {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOMBRE_REVISTA")
    private String nombreRevista;

    @Column(name = "URL")
    private String url;

    private String[] palabrasClaves;

    @ManyToOne
    @JsonIgnore
    private Editores editores;
}
