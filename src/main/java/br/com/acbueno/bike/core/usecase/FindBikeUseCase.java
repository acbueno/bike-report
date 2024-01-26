package br.com.acbueno.bike.core.usecase;

import java.util.List;
import br.com.acbueno.bike.core.domain.Bike;

public interface FindBikeUseCase {

  public List<Bike> finalAll();

  public Bike findById(Long id);

}
