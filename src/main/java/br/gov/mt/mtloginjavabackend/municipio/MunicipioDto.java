package br.gov.mt.mtloginjavabackend.municipio;

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
