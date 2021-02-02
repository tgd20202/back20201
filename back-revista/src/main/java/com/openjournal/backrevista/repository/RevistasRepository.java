package com.openjournal.backrevista.repository;

import com.openjournal.backrevista.model.Editores;
import com.openjournal.backrevista.model.Revistas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RevistasRepository extends JpaRepository<Revistas,Long> {

}
