package com.openjournal.backrevista.api;

import com.openjournal.backrevista.model.Editores;
import com.openjournal.backrevista.model.Revistas;
import com.openjournal.backrevista.repository.EditoresRepository;
import com.openjournal.backrevista.repository.RevistasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("api/revistas")
public class ApiRevistas {

    @Autowired
    private RevistasRepository revistasRepository;

    @Autowired
    private EditoresRepository editoresRepository;

    @GetMapping
    public List<Revistas> getAll(){
        return revistasRepository.findAll();
    }

    @PostMapping(path = "/{id_editor}")
    public Revistas save(@RequestBody Revistas revistas,@PathVariable("id_editor") Long id){
        Editores editores = editoresRepository.findById(id).get();
        revistas.setEditores(editores);
        return revistasRepository.save(revistas);
    }

    @PutMapping(path = "/{id_revista}")
    public Revistas edit(@RequestBody Revistas revista,@PathVariable("id_revista") Long id){
        Revistas revistasEditar = revistasRepository.findById(id).get();
        revistasEditar.setNombreRevista(revista.getNombreRevista());
        revistasEditar.setPalabrasClaves(revista.getPalabrasClaves());
        revistasEditar.setUrl(revista.getUrl());
        return revistasRepository.save(revistasEditar);
    }

    @DeleteMapping(path = "/{id_revista}")
    public void delete(@PathVariable("id_revista") Long id){
        revistasRepository.deleteById(id);
    }

}
