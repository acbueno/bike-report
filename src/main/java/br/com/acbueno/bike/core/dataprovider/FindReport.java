package br.com.acbueno.bike.core.dataprovider;

import java.util.List;
import br.com.acbueno.bike.core.domain.BikeReport;

public interface FindReport {

  List<BikeReport> listBikeReport();

  BikeReport findByBikeId(Long id);

}
