package br.com.acbueno.bike.core.usecase;

import java.util.List;
import br.com.acbueno.bike.core.domain.Part;

public interface FindPartUseCase {

  public List<Part> findAll();

  public Part findById(Long id);

}
