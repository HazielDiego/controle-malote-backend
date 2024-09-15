package br.gov.mt.mtloginjavabackend.municipio.dto;

import br.gov.mt.mtloginjavabackend.municipio.Municipio;

public record MunicipioDto(
        Long id,
        String nome
) {
    public MunicipioDto(Municipio municipio) {
        this(
                municipio.getId(),
                municipio.getNome()
        );
    }
}
