package br.gov.mt.mtloginjavabackend.tipoUnidadeAdministrativa;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TipoUnidadeAdministrativaService {
    private final TipoUnidadeAdministrativaRepository tipoUnidadeAdministrativaRepository;

    public List<TipoUnidadeAdministrativa> findAll() {
        return tipoUnidadeAdministrativaRepository.findAll();
    }
}
