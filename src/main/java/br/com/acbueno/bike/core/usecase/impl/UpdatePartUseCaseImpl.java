package br.com.acbueno.bike.core.usecase.impl;

import br.com.acbueno.bike.core.dataprovider.UpdatePart;
import br.com.acbueno.bike.core.domain.Part;
import br.com.acbueno.bike.core.usecase.UpdatePartUseCase;

public class UpdatePartUseCaseImpl implements UpdatePartUseCase {

  private final UpdatePart updatePart;

  public UpdatePartUseCaseImpl(UpdatePart updatePart) {
    this.updatePart = updatePart;
  }

  @Override
  public void update(Part part) {
    this.updatePart.update(part);
  }

}
