package org.serratec.avaliacao.individual.repository;

import java.util.List;

import org.serratec.avaliacao.individual.model.Candidato;
import org.serratec.avaliacao.individual.model.Escolaridade;
import org.serratec.avaliacao.individual.model.VagaDesejada;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatoRepository extends JpaRepository<Candidato, Long>{
	List<Candidato> findByEscolaridade(Escolaridade escolaridade);
	List<Candidato> findByVagaDesejada(VagaDesejada vagaDesejada);

}
