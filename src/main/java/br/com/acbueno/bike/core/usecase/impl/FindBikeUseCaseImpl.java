package br.com.acbueno.bike.core.usecase.impl;

import java.util.List;
import br.com.acbueno.bike.core.dataprovider.FindBike;
import br.com.acbueno.bike.core.domain.Bike;
import br.com.acbueno.bike.core.usecase.FindBikeUseCase;

public class FindBikeUseCaseImpl implements FindBikeUseCase {

  private final FindBike findBike;

  public FindBikeUseCaseImpl(FindBike findBike) {
    this.findBike = findBike;
  }

  @Override
  public List<Bike> finalAll() {
    return this.findBike.findAll();
  }

  @Override
  public Bike findById(Long id) {
    return this.findBike.findById(id);
  }

}
