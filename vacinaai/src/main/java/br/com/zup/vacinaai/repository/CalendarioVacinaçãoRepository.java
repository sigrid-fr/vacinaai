package br.com.zup.vacinaai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.zup.vacinaai.model.CalendarioVacinação;

public interface CalendarioVacinaçãoRepository extends JpaRepository<CalendarioVacinação, Integer>{
	
	List<CalendarioVacinação>findByNomeVacina(String nomeVacina);

}
