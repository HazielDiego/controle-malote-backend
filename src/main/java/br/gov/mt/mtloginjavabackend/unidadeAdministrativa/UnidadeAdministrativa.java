package br.gov.mt.mtloginjavabackend.unidadeAdministrativa;

import br.gov.mt.mtloginjavabackend.malote.Malote;
import br.gov.mt.mtloginjavabackend.municipio.Municipio;
import br.gov.mt.mtloginjavabackend.tipoUnidadeAdministrativa.TipoUnidadeAdministrativa;
import jakarta.persistence.*;
import lombok.*;
import org.apache.commons.lang3.builder.EqualsExclude;

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
    @ManyToOne
    @JoinColumn(name = "municipio", referencedColumnName = "id")
    private Municipio municipio;
    @OneToMany(mappedBy = "unidadeAdministrativa")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Malote> malotes;
}
