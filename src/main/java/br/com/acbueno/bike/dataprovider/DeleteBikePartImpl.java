package br.com.acbueno.bike.dataprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.acbueno.bike.core.dataprovider.DeleteBike;
import br.com.acbueno.bike.dataprovider.repository.BikeRepository;

@Component
public class DeleteBikePartImpl implements DeleteBike {

  @Autowired
  private BikeRepository respository;

  @Override
  public void delete(Long id) {
    this.respository.deleteById(id);
  }

}
