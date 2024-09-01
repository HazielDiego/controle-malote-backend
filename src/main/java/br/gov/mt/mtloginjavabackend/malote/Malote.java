package br.gov.mt.mtloginjavabackend.malote;

import br.gov.mt.mtloginjavabackend.unidadeAdministrativa.UnidadeAdministrativa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Malote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero;
    private Boolean ativo;
    @ManyToOne
    @JoinColumn(name = "unidade_administrativa", referencedColumnName = "id")
    private UnidadeAdministrativa unidadeAdministrativa;
}
