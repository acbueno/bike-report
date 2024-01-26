package br.com.acbueno.bike.dataprovider;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.acbueno.bike.core.dataprovider.UpdateBike;
import br.com.acbueno.bike.core.domain.Bike;
import br.com.acbueno.bike.dataprovider.repository.BikeRepository;
import br.com.acbueno.bike.dataprovider.repository.entity.BikeEntity;

@Component
public class UpdateBikeImpl implements UpdateBike {

  @Autowired
  private BikeRepository respository;

  @Override
  public void update(Bike bike) {
    Optional<BikeEntity> bikeEntity = respository.findById(bike.getId());

    if (bikeEntity.isPresent()) {
      bikeEntity.get().setBrand(bike.getBrand());
      bikeEntity.get().setType(bike.getType());
      respository.save(bikeEntity.get());
    }
  }

}
