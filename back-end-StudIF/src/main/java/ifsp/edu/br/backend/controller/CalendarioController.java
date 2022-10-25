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

import ifsp.edu.br.backend.model.Calendario;
import ifsp.edu.br.backend.repository.CalendarioRepository;


@RestController
@CrossOrigin
public class CalendarioController {
    @Autowired
    CalendarioRepository calendarioRepository;

    @GetMapping("/calendario")
    public List<Calendario> recuperaCalendario(){
        return (List<Calendario>) calendarioRepository.findAll();
    }

    @GetMapping("/calendario/{id}")
    public Optional<Calendario> RecuperaCalendarioPeloId(@PathVariable("id") Long id) {
        return calendarioRepository.findById(id);
    }

    @PostMapping("/calendario")
    public void adicionaCalendario(@RequestBody Calendario novoCalendario){
        calendarioRepository.save(novoCalendario);
    }

    @DeleteMapping("/calendario/{id}") 
    public void deletaCalendario(@PathVariable("id") Long id){
        calendarioRepository.deleteById(id);
    }
}
