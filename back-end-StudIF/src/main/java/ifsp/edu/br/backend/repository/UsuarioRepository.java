package ifsp.edu.br.backend.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import ifsp.edu.br.backend.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
    List<Usuario> findByEmail(String email);
}