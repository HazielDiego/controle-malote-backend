package br.gov.mt.mtloginjavabackend.municipio;

import br.gov.mt.mtloginjavabackend.security.utils.MyUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/municipio")
public class MunicipioController {
    private final MunicipioService municipioService;

    @GetMapping
    public ResponseEntity<List<MunicipioDto>> findByNome(@RequestParam String nomeBase64) {
        String nome = MyUtils.decodeBase64(nomeBase64);
        return ResponseEntity
                .ok(municipioService
                        .findByNomeLikeIgnoreCase(nome)
                        .stream()
                        .map(MunicipioDto::new)
                        .toList());
    }
}
