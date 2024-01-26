package br.com.acbueno.bike.core.dataprovider;

import java.util.List;
import br.com.acbueno.bike.core.domain.Bike;

public interface FindBike {

  public List<Bike> findAll();

  public Bike findById(Long id);

}
