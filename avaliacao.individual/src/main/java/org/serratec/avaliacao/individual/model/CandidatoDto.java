package org.serratec.avaliacao.individual.model;

import java.time.LocalDate;

public record CandidatoDto(
		Long id,
		String nome,
		LocalDate dataNascimento,
		String cpf,
		Escolaridade escolaridade,
		VagaDesejada vagaDesejada,
		StatusCurriculo statusCurriculo     
		) {
	
	public Candidato toEntity() {
		Candidato candidato = new Candidato();
		candidato.setId(this.id);
		candidato.setNome(this.nome);
		candidato.setDataNascimento(this.dataNascimento);
		candidato.setCpf(this.cpf);
		candidato.setEscolaridade(this.escolaridade);
		candidato.setVagaDesejada(this.vagaDesejada);
		candidato.setStatusCurriculo(this.statusCurriculo);
		return candidato;
	}
	
	public static CandidatoDto toDto(Candidato candidato) {
		return new CandidatoDto(candidato.getId(), 
				candidato.getNome(), 
				candidato.getDataNascimento(),
				candidato.getCpf(), 
				candidato.getEscolaridade(), 
				candidato.getVagaDesejada(), 
				candidato.getStatusCurriculo());
	}

}
