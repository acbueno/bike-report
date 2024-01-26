package br.com.acbueno.bike.dataprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.acbueno.bike.core.dataprovider.InsertPart;
import br.com.acbueno.bike.core.domain.Part;
import br.com.acbueno.bike.dataprovider.repository.BikeRepository;
import br.com.acbueno.bike.dataprovider.repository.PartRepository;
import br.com.acbueno.bike.dataprovider.repository.mapper.PartRepositoyMapper;

@Component
public class InsertPartImpl implements InsertPart {

  @Autowired
  private PartRepository partRepository;

  @Autowired
  private BikeRepository bikeRespository;

  @Override
  public void insert(Part part) {
    var partEntity = PartRepositoyMapper.toPartEntity(part);
    var bikeEntity = bikeRespository.findById(part.getBikeId());
    var bike = bikeEntity.get();

    if (bike != null) {
      partEntity.setBike(bike);
    }

    this.partRepository.saveAndFlush(partEntity);
  }

}
