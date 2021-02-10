package br.com.zup.vacinaai.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.zup.vacinaai.model.CalendarioVacinação;

public class CalendarioVacinaçãoDto {
	private Integer vacina_id;
	private String nomeVacina;
	private String email;
	private LocalDateTime dataVacina;
	
	public CalendarioVacinaçãoDto(CalendarioVacinação calendarioVacinação) {
		this.vacina_id = calendarioVacinação.getVacinaId();
		this.nomeVacina = calendarioVacinação.getNomeVacina();
		this.email = calendarioVacinação.getEmail();
		this.dataVacina = calendarioVacinação.getDataVacina();
		
	}
	
	public Integer getVacinaId() {
		return vacina_id;
	}
	public String getNomeVacina() {
		return nomeVacina;
	}
	public String getEmail() {
		return email;
	}
	public LocalDateTime getDataVacina() {
		return dataVacina;
	}

	public static List<CalendarioVacinaçãoDto> converter(List<CalendarioVacinação> vacinas) {
		return vacinas.stream().map(CalendarioVacinaçãoDto::new).collect(Collectors.toList());
	}
	
	

}
