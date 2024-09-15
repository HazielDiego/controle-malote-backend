package br.gov.mt.mtloginjavabackend.controleDeAcesso;

import br.gov.mt.mtloginjavabackend.controleDeAcesso.dto.ControleDeAcessoDto;
import br.gov.mt.mtloginjavabackend.controleDeAcesso.dto.ControleDeAcessoSaveDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controle-de-acesso")
@RequiredArgsConstructor
public class ControleDeAcessoController {

    private final ControleDeAcessoService controleDeAcessoService;

    @PostMapping
    public ResponseEntity<ControleDeAcessoDto> salvar(@RequestBody ControleDeAcessoSaveDto dto) {
        ControleDeAcesso controleDeAcessoSalvo = controleDeAcessoService.salvar(dto);
        return ResponseEntity.ok(new ControleDeAcessoDto(controleDeAcessoSalvo));
    }
}
