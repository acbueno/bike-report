package br.com.acbueno.bike.dataprovider.repository.mapper;

import org.modelmapper.ModelMapper;
import br.com.acbueno.bike.core.domain.Bike;
import br.com.acbueno.bike.dataprovider.repository.entity.BikeEntity;

public class BikeRepositoryMapper {

  public static BikeEntity toBikeEntity(Bike bike) {
    ModelMapper mapper = new ModelMapper();
    return mapper.map(bike, BikeEntity.class);
  }

  public static Bike toBike(BikeEntity bikeEntity) {
    ModelMapper mapper = new ModelMapper();
    return mapper.map(bikeEntity, Bike.class);
  }

}
