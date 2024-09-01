package br.gov.mt.mtloginjavabackend.unidadeAdministrativa;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UnidadeAdministrativaService {
    private final UnidadeAdministrativaRepository unidadeAdministrativaRepository;

    public List<UnidadeAdministrativa> findAll() {
        return unidadeAdministrativaRepository.findAll();
    }
}
