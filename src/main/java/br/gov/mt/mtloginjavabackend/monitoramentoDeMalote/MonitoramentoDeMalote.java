package br.gov.mt.mtloginjavabackend.monitoramentoDeMalote;

import br.gov.mt.mtloginjavabackend.malote.Malote;
import br.gov.mt.mtloginjavabackend.statusMonitoramentoDeMalote.StatusMonitoramentoDeMalote;
import br.gov.mt.mtloginjavabackend.unidadeAdministrativa.UnidadeAdministrativa;

import java.math.BigDecimal;

public class MonitoramentoDeMalote {

    private Long id;
    private UnidadeAdministrativa unidadeDestino;
    private UnidadeAdministrativa unidadeOrigem;
    private Malote malote;
    private String numeroDoLacre;
    private BigDecimal peso;
    private StatusMonitoramentoDeMalote statusMonitoramentoDeMalote;
}
