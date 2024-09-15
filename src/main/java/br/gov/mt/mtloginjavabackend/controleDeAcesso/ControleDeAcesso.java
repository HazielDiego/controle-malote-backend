package br.gov.mt.mtloginjavabackend.controleDeAcesso;

import br.gov.mt.mtloginjavabackend.municipio.Municipio;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = {"cpf", "municipio"})
})
public class ControleDeAcesso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    @ManyToOne
    @JoinColumn(name = "municipio", referencedColumnName = "id")
    private Municipio municipio;
}
