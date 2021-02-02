package com.openjournal.backrevista.repository;

import com.openjournal.backrevista.model.Editores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EditoresRepository extends JpaRepository<Editores,Long> {

    boolean existsByEmail(String email);
    Editores findAllByEmail(String email);
}
