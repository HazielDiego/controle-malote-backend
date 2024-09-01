package br.gov.mt.mtloginjavabackend.statusMonitoramentoDeMalote;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StatusMonitoramentoDeMaloteService {

    private final StatusMonitoramentoDeMaloteRepository statusMonitoramentoDeMaloteRepository;

    public List<StatusMonitoramentoDeMalote> findAll() {
        return statusMonitoramentoDeMaloteRepository.findAll();
    }
}
