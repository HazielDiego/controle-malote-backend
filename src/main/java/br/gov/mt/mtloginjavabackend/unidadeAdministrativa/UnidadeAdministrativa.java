package br.gov.mt.mtloginjavabackend.unidadeAdministrativa;

import br.gov.mt.mtloginjavabackend.malote.Malote;
import br.gov.mt.mtloginjavabackend.tipoUnidadeAdministrativa.TipoUnidadeAdministrativa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UnidadeAdministrativa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @ManyToOne
    @JoinColumn(name = "tipo_unidade_administrativa", referencedColumnName = "id")
    private TipoUnidadeAdministrativa tipoUnidadeAdministrativa;
    private String percurso;
    @OneToMany(mappedBy = "unidadeAdministrativa")
    private List<Malote> malotes;
}
