package br.gov.mt.mtloginjavabackend.unidadeAdministrativa;

import br.gov.mt.mtloginjavabackend.malote.Malote;
import br.gov.mt.mtloginjavabackend.tipoUnidadeAdministrativa.TipoUnidadeAdministrativa;

import java.util.List;

public class UnidadeAdministrativa {

    private Long id;
    private String nome;
    private TipoUnidadeAdministrativa tipoUnidadeAdministrativa;
    private String percurso;
    private List<Malote> malotes;
}
