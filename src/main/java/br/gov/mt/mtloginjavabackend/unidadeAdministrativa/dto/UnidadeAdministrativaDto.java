package br.gov.mt.mtloginjavabackend.unidadeAdministrativa.dto;

import br.gov.mt.mtloginjavabackend.malote.dto.MaloteDto;
import br.gov.mt.mtloginjavabackend.unidadeAdministrativa.UnidadeAdministrativa;

import java.util.List;

public record UnidadeAdministrativaDto(
        Long id,
        String nome,
        String percurso,
        List<MaloteDto> malotes) {

    public UnidadeAdministrativaDto(UnidadeAdministrativa unidadeAdministrativa) {
        this(
                unidadeAdministrativa.getId(),
                unidadeAdministrativa.getNome(),
                unidadeAdministrativa.getPercurso(),
                unidadeAdministrativa.getMalotes().stream().map(MaloteDto::new).toList()
        );
    }
}
