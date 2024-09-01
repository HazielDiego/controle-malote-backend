package br.gov.mt.mtloginjavabackend.unidadeAdministrativa;

import br.gov.mt.mtloginjavabackend.unidadeAdministrativa.dto.UnidadeAdministrativaDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/unidade-administrativa")
@RequiredArgsConstructor
public class UnidadeAdministrativaController {
    private final UnidadeAdministrativaService unidadeAdministrativaService;

    @GetMapping
    private ResponseEntity<List<UnidadeAdministrativaDto>> findAll() {
        return ResponseEntity.ok(unidadeAdministrativaService
                .findAll()
                .stream()
                .map(UnidadeAdministrativaDto::new)
                .toList());
    }
}
