package ifsp.edu.br.backend.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Materias {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tipo;
    private String descrição;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_calendario") // tabela submissa
    // @JsonManagedReference
    private Calendario calendario;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_materia")
    // @JsonManagedReference
    private List<Dicas> dicas;

    @ManyToMany(mappedBy = "materias")
    @JsonBackReference
    private List<Usuario> usuarios;

    public Materias() {
    }

    public Calendario getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendario calendario) {
        this.calendario = calendario;
    }

    public List<Dicas> getDicas() {
        return dicas;
    }

    public void setDicas(List<Dicas> dicas) {
        this.dicas = dicas;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

}
