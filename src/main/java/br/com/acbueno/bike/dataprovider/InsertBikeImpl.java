package br.com.acbueno.bike.dataprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.acbueno.bike.core.dataprovider.InsertBike;
import br.com.acbueno.bike.core.domain.Bike;
import br.com.acbueno.bike.dataprovider.repository.BikeRepository;
import br.com.acbueno.bike.dataprovider.repository.mapper.BikeRepositoryMapper;

@Component
public class InsertBikeImpl implements InsertBike {

  @Autowired
  private BikeRepository repository;

  @Override
  public void insert(Bike bike) {
    var bikeEntity = BikeRepositoryMapper.toBikeEntity(bike);

    this.repository.save(bikeEntity);
  }

}
