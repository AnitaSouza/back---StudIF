package ifsp.edu.br.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ifsp.edu.br.backend.model.Materias;
import ifsp.edu.br.backend.repository.MateriasRepository;


@RestController
@CrossOrigin
public class MateriasController {
    @Autowired
    MateriasRepository materiasRepository;

    @GetMapping("/materias")
    public List<Materias> recuperaMaterias(){
        return (List<Materias>) materiasRepository.findAll();
    }

    @GetMapping("/materias/{id}")
    public Optional<Materias> RecuperaMateriaPeloId(@PathVariable("id") Long id) {
        return materiasRepository.findById(id);
    }

    @PostMapping("/Materias")
    public void adicionaMaterias(@RequestBody Materias novasMaterias){
        materiasRepository.save(novasMaterias);
    }

    @DeleteMapping("/Materias/{id}") 
    public void deletaMaterias(@PathVariable("id") Long id){
        materiasRepository.deleteById(id);
    }
}
