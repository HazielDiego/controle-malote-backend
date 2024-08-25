package br.gov.mt.mtloginjavabackend.tipoDeConteudo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TipoDeConteudoService {

    private final TipoDeConteudoRepository tipoDeConteudoRepository;

    public List<TipoDeConteudo> findAll() {
        return tipoDeConteudoRepository.findAll();
    }
}
