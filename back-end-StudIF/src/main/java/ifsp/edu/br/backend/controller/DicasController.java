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

import ifsp.edu.br.backend.model.Dicas;
import ifsp.edu.br.backend.repository.DicasRepository;


@RestController
@CrossOrigin
public class DicasController {
    @Autowired
    DicasRepository dicasRepository;

    @GetMapping("/dicas")
    public List<Dicas> recuperaDicas(){
        return (List<Dicas>) dicasRepository.findAll();
    }

    @GetMapping("/dicas/{id}")
    public Optional<Dicas> RecuperaDicaPeloId(@PathVariable("id") Long id) {
        return dicasRepository.findById(id);
    }

    @PostMapping("/dicas")
    public void adicionaDicas(@RequestBody Dicas novasDicas){
        dicasRepository.save(novasDicas);
    }

    @DeleteMapping("/dicas/{id}") 
    public void deletaDicas(@PathVariable("id") Long id){
        dicasRepository.deleteById(id);
    }
}
