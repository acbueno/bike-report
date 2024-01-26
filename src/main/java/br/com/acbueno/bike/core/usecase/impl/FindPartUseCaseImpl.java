package br.com.acbueno.bike.core.usecase.impl;

import java.util.List;
import br.com.acbueno.bike.core.dataprovider.FindPart;
import br.com.acbueno.bike.core.domain.Part;
import br.com.acbueno.bike.core.usecase.FindPartUseCase;

public class FindPartUseCaseImpl implements FindPartUseCase {

  private final FindPart findPart;

  public FindPartUseCaseImpl(FindPart findPart) {
    this.findPart = findPart;
  }

  @Override
  public List<Part> findAll() {
    return this.findPart.findAll();
  }

  @Override
  public Part findById(Long id) {
    return this.findPart.findById(id);
  }

}
