package br.gov.mt.mtloginjavabackend.tipoUnidadeAdministrativa;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tipo-unidade-administrativa")
@RequiredArgsConstructor
public class TipoUnidadeAdministrativaController {

    private final TipoUnidadeAdministrativaService tipoUnidadeAdministrativaService;

    @GetMapping
    public List<TipoUnidadeAdministrativa> findAll() {
        return tipoUnidadeAdministrativaService.findAll();
    }
}
