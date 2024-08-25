package br.gov.mt.mtloginjavabackend.tipoDeConteudo;

import br.gov.mt.mtloginjavabackend.tipoDeConteudo.dto.TipoDeConteudoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tipo-de-conteudo")
@RequiredArgsConstructor
public class TipoDeConteudoController {

    private final TipoDeConteudoService tipoDeConteudoService;

    @GetMapping
    public ResponseEntity<List<TipoDeConteudoDto>> findAll() {
        return ResponseEntity.ok(tipoDeConteudoService
                .findAll()
                .stream()
                .map(TipoDeConteudoDto::new)
                .toList());
    }
}
