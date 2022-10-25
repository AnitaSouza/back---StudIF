package ifsp.edu.br.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Calendario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String evento;
    private String data;

    @OneToOne(mappedBy = "calendario") // campo alternativas dentro da tabela Questão
    @JsonBackReference
    private Materias materia;

    public Calendario(){
        
    }
    
    public Materias getMateria() {
        return materia;
    }

    public void setMateria(Materias materia) {
        this.materia = materia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
}
