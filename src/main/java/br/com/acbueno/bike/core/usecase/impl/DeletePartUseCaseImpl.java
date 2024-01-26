package br.com.acbueno.bike.core.usecase.impl;

import br.com.acbueno.bike.core.dataprovider.DeletePart;
import br.com.acbueno.bike.core.usecase.DeletePartUseCase;

public class DeletePartUseCaseImpl implements DeletePartUseCase {

  private final DeletePart deletePart;

  public DeletePartUseCaseImpl(DeletePart deletePart) {
    this.deletePart = deletePart;
  }

  @Override
  public void delete(Long id) {
    this.deletePart.delete(id);
  }

}
