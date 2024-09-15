package br.gov.mt.mtloginjavabackend.controleDeAcesso.dto;

import br.gov.mt.mtloginjavabackend.controleDeAcesso.ControleDeAcesso;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

public record ControleDeAcessoSaveDto(
        Long id,
        @NotEmpty
        String nome,
        @NotEmpty
        @CPF
        String cpf,
        @NotNull
        Long municipio
) {
    public ControleDeAcessoSaveDto(ControleDeAcesso controleDeAcesso) {
        this(
                controleDeAcesso.getId(),
                controleDeAcesso.getNome(),
                controleDeAcesso.getCpf(),
                controleDeAcesso
                        .getMunicipio()
                        .getId()
        );
    }
}
