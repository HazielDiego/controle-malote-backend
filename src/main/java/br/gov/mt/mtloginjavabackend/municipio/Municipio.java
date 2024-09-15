package br.gov.mt.mtloginjavabackend.municipio;

import br.gov.mt.mtloginjavabackend.malote.Malote;
import br.gov.mt.mtloginjavabackend.unidadeAdministrativa.UnidadeAdministrativa;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Municipio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToMany(mappedBy = "municipio")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<UnidadeAdministrativa> listaUnidadeAdministrativa;
}
