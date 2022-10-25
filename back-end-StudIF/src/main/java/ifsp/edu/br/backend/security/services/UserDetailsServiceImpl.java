package ifsp.edu.br.backend.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ifsp.edu.br.backend.model.Usuario;
import ifsp.edu.br.backend.repository.UsuarioRepository;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Encontra um usuário no banco de dados
        Usuario usuario = usuarioRepository.findByEmail(username).stream().findFirst().get();
        // Depois retorna um objeto UserDetailsImpl com base no usuário encontrado
        return new UserDetailsImpl(usuario);        
    } 
}
