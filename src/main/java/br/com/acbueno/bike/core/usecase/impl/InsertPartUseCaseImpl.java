package br.com.acbueno.bike.core.usecase.impl;

import br.com.acbueno.bike.core.dataprovider.InsertPart;
import br.com.acbueno.bike.core.domain.Part;
import br.com.acbueno.bike.core.usecase.InsertPartUseCase;

public class InsertPartUseCaseImpl implements InsertPartUseCase {


  private final InsertPart insertPart;

  public InsertPartUseCaseImpl(InsertPart insertPart) {
    this.insertPart = insertPart;
  }

  @Override
  public void insert(Part part) {
    this.insertPart.insert(part);
  }

}
