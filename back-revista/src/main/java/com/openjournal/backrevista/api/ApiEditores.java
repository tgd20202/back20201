package com.openjournal.backrevista.api;

import com.openjournal.backrevista.model.Editores;
import com.openjournal.backrevista.repository.EditoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("api/editores")
public class ApiEditores {

    @Autowired
    private EditoresRepository editoresRepository;

    @GetMapping
    public List<Editores> getAll(){
        return editoresRepository.findAll();
    }

    @PostMapping
    public Editores save(@RequestBody Editores editores){
        return editoresRepository.existsByEmail(editores.getEmail())
                ?editoresRepository.findAllByEmail(editores.getEmail())
                :editoresRepository.save(editores);
    }

    @PutMapping(path = "/{id}")
    public Editores edit(@RequestBody Editores editores,@PathVariable Long id){
        Editores editoresEditar = editoresRepository.findById(id).get();
        editoresEditar.setEmail(editores.getEmail());
        editoresEditar.setRoles(editores.getRoles());
        return editoresRepository.save(editoresEditar);
    }

    @DeleteMapping(path ="/{id}")
    public void delete(@PathVariable Long id){
        editoresRepository.deleteById(id);
    }

}
