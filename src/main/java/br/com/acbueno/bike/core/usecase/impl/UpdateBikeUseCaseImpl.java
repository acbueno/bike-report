package br.com.acbueno.bike.core.usecase.impl;

import br.com.acbueno.bike.core.dataprovider.UpdateBike;
import br.com.acbueno.bike.core.domain.Bike;
import br.com.acbueno.bike.core.usecase.UpdateBikeUseCase;

public class UpdateBikeUseCaseImpl implements UpdateBikeUseCase {

  private final UpdateBike updateBike;

  public UpdateBikeUseCaseImpl(UpdateBike updateBike) {
    this.updateBike = updateBike;
  }

  @Override
  public void update(Bike bike) {
    this.updateBike.update(bike);
  }

}
