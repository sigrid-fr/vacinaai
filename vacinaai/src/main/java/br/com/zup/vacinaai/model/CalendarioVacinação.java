package br.com.zup.vacinaai.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "vacinacao")
public class CalendarioVacinação {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vacina_id")
	private Integer vacina_id;
	
	@Column(name = "nome_vacina", nullable = false)
	private String nomeVacina;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "data_vacina", nullable = false)
	private LocalDateTime dataVacina = LocalDateTime.now();

	public CalendarioVacinação(String nomeVacina, String email) {
		this.nomeVacina = nomeVacina;
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vacina_id == null) ? 0 : vacina_id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CalendarioVacinação other = (CalendarioVacinação) obj;
		if (vacina_id == null) {
			if (other.vacina_id != null)
				return false;
		} else if (!vacina_id.equals(other.vacina_id))
			return false;
		return true;
	}

	public Integer getVacinaId() {
		return vacina_id;
	}

	public void setVacinaId(Integer vacina_id) {
		this.vacina_id = vacina_id;
	}

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

	public LocalDateTime getDataVacina() {
		return dataVacina;
	}

	public void setDatatVacina(LocalDateTime dataVacina) {
		this.dataVacina = dataVacina;
	}
	
	
}
