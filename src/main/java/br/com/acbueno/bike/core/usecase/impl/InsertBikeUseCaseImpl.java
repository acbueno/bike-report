package br.com.acbueno.bike.core.usecase.impl;


import br.com.acbueno.bike.core.dataprovider.InsertBike;
import br.com.acbueno.bike.core.domain.Bike;
import br.com.acbueno.bike.core.usecase.InsertBikeUseCase;

public class InsertBikeUseCaseImpl implements InsertBikeUseCase {

  private final InsertBike insertBike;

  public InsertBikeUseCaseImpl(InsertBike insertBike) {
    this.insertBike = insertBike;
  }

  @Override
  public void insert(Bike bike) {
    this.insertBike.insert(bike);
  }

}
