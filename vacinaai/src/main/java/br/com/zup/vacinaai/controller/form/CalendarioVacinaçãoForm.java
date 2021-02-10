package br.com.zup.vacinaai.controller.form;

import br.com.zup.vacinaai.model.CalendarioVacinação;

public class CalendarioVacinaçãoForm {
	
	private String nomeVacina;
	private String email;
	
	
	public String getNomeVacina() {
		return nomeVacina;
	}
	public void setNomeVacina(String nomeVacina) {
		this.nomeVacina = nomeVacina;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public CalendarioVacinação converter() {
		return new CalendarioVacinação(nomeVacina, email);
	}
	
	

}
