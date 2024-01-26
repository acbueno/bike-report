package br.com.acbueno.bike.core.usecase.impl;

import java.util.List;
import br.com.acbueno.bike.core.dataprovider.FindReport;
import br.com.acbueno.bike.core.domain.BikeReport;
import br.com.acbueno.bike.core.usecase.FindBikeReportUseCase;

public class FindBikeReportUseCaseImpl implements FindBikeReportUseCase {

  private final FindReport findReport;

  public FindBikeReportUseCaseImpl(FindReport findReport) {
    this.findReport = findReport;
  }

  @Override
  public List<BikeReport> findAll() {
    return findReport.listBikeReport();
  }

  @Override
  public BikeReport findByBikeId(Long id) {
    return findReport.findByBikeId(id);
  }

}
