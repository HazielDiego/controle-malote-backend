package br.gov.mt.mtloginjavabackend.controleDeAcesso;

import br.gov.mt.mtloginjavabackend.controleDeAcesso.dto.ControleDeAcessoSaveDto;
import br.gov.mt.mtloginjavabackend.municipio.MunicipioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class ControleDeAcessoService {

    private final ControleDeAcessoRepository controleDeAcessoRepository;
    private final MunicipioService municipioService;

    public ControleDeAcesso salvar(ControleDeAcessoSaveDto dto) {
        ControleDeAcesso controleDeAcesso = new ControleDeAcesso();
        if (dto.id() != null) {
            controleDeAcesso = this.buscarPorId(dto.id());
        }
        BeanUtils.copyProperties(dto, controleDeAcesso);
        controleDeAcesso.setMunicipio(municipioService.findByIdOrElseThrowBadRequest(dto.municipio()));
        return controleDeAcessoRepository.save(controleDeAcesso);
    }

    public ControleDeAcesso buscarPorId(Long id) {
        return controleDeAcessoRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Controle de acesso não encontrado"));
    }

    public void deletar(Long id) {
        controleDeAcessoRepository.deleteById(id);
    }

    public ControleDeAcesso findByCpf(String cpf) {
        return controleDeAcessoRepository.findByCpf(cpf);    }
}
