package br.gov.mt.mtloginjavabackend.tipoDeConteudo.dto;

import br.gov.mt.mtloginjavabackend.tipoDeConteudo.TipoDeConteudo;

public record TipoDeConteudoDto(
        Long id,
        String descricao
) {
    public TipoDeConteudoDto(TipoDeConteudo tipoDeConteudo) {
        this(tipoDeConteudo.getId(), tipoDeConteudo.getDescricao());
    }
}
