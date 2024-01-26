package br.com.acbueno.bike.core.usecase.impl;

import br.com.acbueno.bike.core.dataprovider.DeleteBike;
import br.com.acbueno.bike.core.usecase.DeleteBikeUseCase;

public class DeleteBikeUseCaseImpl implements DeleteBikeUseCase {

  private final DeleteBike deleteBike;

  public DeleteBikeUseCaseImpl(DeleteBike deleteBike) {
    this.deleteBike = deleteBike;
  }

  @Override
  public void deleteById(Long id) {
    this.deleteBike.delete(id);
  }

}
