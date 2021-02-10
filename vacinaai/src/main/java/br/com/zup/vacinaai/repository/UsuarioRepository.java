package br.com.zup.vacinaai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.zup.vacinaai.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
