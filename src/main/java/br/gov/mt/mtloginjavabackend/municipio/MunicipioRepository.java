package br.gov.mt.mtloginjavabackend.municipio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MunicipioRepository extends JpaRepository<Municipio, Long> {
    @Query("""
            SELECT m FROM Municipio m WHERE UPPER(m.nome) like UPPER(CONCAT('%',:nome,'%'))
            """)
    List<Municipio> findByNomeLikeIgnoreCase(String nome);
}
