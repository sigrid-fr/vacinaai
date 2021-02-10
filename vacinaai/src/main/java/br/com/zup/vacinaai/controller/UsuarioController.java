package br.com.zup.vacinaai.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.zup.vacinaai.model.Usuario;
import br.com.zup.vacinaai.repository.UsuarioRepository;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@RequestMapping("/usuarios")
	@ResponseBody
	public List<Usuario> lista(){
		List<Usuario> usuarios = usuarioRepository.findAll();
		
		return usuarios;
		
	}
}
