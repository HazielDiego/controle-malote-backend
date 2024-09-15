package br.gov.mt.mtloginjavabackend.controleDeAcesso;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ControleDeAcessoRepository extends JpaRepository<ControleDeAcesso, Long> {
    ControleDeAcesso findByCpf(String cpf);
}
