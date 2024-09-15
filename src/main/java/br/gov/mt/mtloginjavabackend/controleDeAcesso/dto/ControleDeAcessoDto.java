package br.gov.mt.mtloginjavabackend.controleDeAcesso.dto;

import br.gov.mt.mtloginjavabackend.controleDeAcesso.ControleDeAcesso;
import br.gov.mt.mtloginjavabackend.municipio.dto.MunicipioDto;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

public record ControleDeAcessoDto(
        Long id,
        @NotEmpty
        String nome,
        @NotEmpty
        @CPF
        String cpf,
        @NotNull
        MunicipioDto municipio
) {
    public ControleDeAcessoDto(ControleDeAcesso controleDeAcesso) {
        this(
                controleDeAcesso.getId(),
                controleDeAcesso.getNome(),
                controleDeAcesso.getCpf(),
                new MunicipioDto(controleDeAcesso.getMunicipio())
        );
    }
}
