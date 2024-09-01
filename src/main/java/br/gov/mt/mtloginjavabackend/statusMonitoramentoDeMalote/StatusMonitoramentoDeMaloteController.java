package br.gov.mt.mtloginjavabackend.statusMonitoramentoDeMalote;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/status-monitoramento-de-malote")
@RequiredArgsConstructor
public class StatusMonitoramentoDeMaloteController {

    private final StatusMonitoramentoDeMaloteService statusMonitoramentoDeMaloteService;

    @GetMapping
    public List<StatusMonitoramentoDeMalote> findAll() {
        return statusMonitoramentoDeMaloteService.findAll();
    }
}
