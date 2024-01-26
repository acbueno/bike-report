package br.com.acbueno.bike.core.usecase;

import java.util.List;
import br.com.acbueno.bike.core.domain.BikeReport;

public interface FindBikeReportUseCase {

  public List<BikeReport> findAll();

  public BikeReport findByBikeId(Long id);

}
