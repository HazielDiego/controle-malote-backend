package br.gov.mt.mtloginjavabackend.malote.dto;

import br.gov.mt.mtloginjavabackend.malote.Malote;

public record MaloteDto(
        Long id,
        String numero,
        Boolean ativo,
        Long unidadeAdministrativa
) {
    public MaloteDto(Malote malote) {
        this(
                malote.getId(),
                malote.getNumero(),
                malote.getAtivo(),
                malote.getUnidadeAdministrativa().getId()
        );
    }
}
