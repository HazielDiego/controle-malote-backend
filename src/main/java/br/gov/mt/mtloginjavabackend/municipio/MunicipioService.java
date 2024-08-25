package br.gov.mt.mtloginjavabackend.municipio;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MunicipioService {
    private final MunicipioRepository municipioRepository;

    public List<Municipio> findByNomeLikeIgnoreCase(String nome) {
        return municipioRepository.findByNomeLikeIgnoreCase(nome);
    }

    public Municipio findByIdOrElseThrowBadRequest(Long id) {
        return municipioRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Municipio de Id: " + id + " não encontrado"));
    }

}
