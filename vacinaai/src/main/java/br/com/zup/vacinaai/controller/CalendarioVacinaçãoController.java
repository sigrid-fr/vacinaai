package br.com.zup.vacinaai.controller;

import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import br.com.zup.vacinaai.controller.dto.CalendarioVacinaçãoDto;
import br.com.zup.vacinaai.controller.form.CalendarioVacinaçãoForm;
import br.com.zup.vacinaai.model.CalendarioVacinação;
import br.com.zup.vacinaai.repository.CalendarioVacinaçãoRepository;

@RestController
@RequestMapping("/vacinas")
public class CalendarioVacinaçãoController {
	
	@Autowired
	private CalendarioVacinaçãoRepository calendarioRepository;
	
	@GetMapping
	public List<CalendarioVacinaçãoDto> lista(String nomeVacina){
		if (nomeVacina == null){
			List<CalendarioVacinação> vacinas = calendarioRepository.findAll();
			return CalendarioVacinaçãoDto.converter(vacinas);
		} else {
			List<CalendarioVacinação> vacinas = calendarioRepository.findByNomeVacina(nomeVacina);
			return CalendarioVacinaçãoDto.converter(vacinas);
		}
	}
	
	@PostMapping
	public ResponseEntity<CalendarioVacinaçãoDto> cadastrar(@RequestBody CalendarioVacinaçãoForm form, UriComponentsBuilder uriBuilder) {
		CalendarioVacinação vacina = form.converter();
		calendarioRepository.save(vacina);
		
		URI uri = uriBuilder.path("/vacinas/{id}").buildAndExpand(vacina.getVacinaId()).toUri();
		return ResponseEntity.created(uri).body(new CalendarioVacinaçãoDto(vacina));
	}
}