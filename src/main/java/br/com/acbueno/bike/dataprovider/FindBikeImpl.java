package br.com.acbueno.bike.dataprovider;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.acbueno.bike.core.dataprovider.FindBike;
import br.com.acbueno.bike.core.domain.Bike;
import br.com.acbueno.bike.dataprovider.repository.BikeRepository;
import br.com.acbueno.bike.dataprovider.repository.entity.BikeEntity;
import br.com.acbueno.bike.dataprovider.repository.mapper.BikeRepositoryMapper;

@Component
public class FindBikeImpl implements FindBike {

  @Autowired
  private BikeRepository respository;

  @Override
  public List<Bike> findAll() {
    List<Bike> listBike = new ArrayList<>();
    List<BikeEntity> findAll = respository.findAll();
    findAll.forEach(it -> {
      var bikeEntity = BikeRepositoryMapper.toBike(it);
      listBike.add(bikeEntity);
    });
    return listBike;
  }

  @Override
  public Bike findById(Long id) {
    var bike = respository.findById(id).get();
    return BikeRepositoryMapper.toBike(bike);
  }

}
