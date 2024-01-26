package br.com.acbueno.bike.dataprovider.repository.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import br.com.acbueno.bike.core.domain.Part;
import br.com.acbueno.bike.dataprovider.repository.entity.PartEntity;

public class PartRepositoyMapper {

  public static PartEntity toPartEntity(Part part) {
    ModelMapper mapper = new ModelMapper();
    mapper.addMappings(new PropertyMap<Part, PartEntity>() {
      @Override
      protected void configure() {
        skip(destination.getId());
      }
    });
    return mapper.map(part, PartEntity.class);
  }

  public static Part toPart(PartEntity partEntity) {
    ModelMapper mapper = new ModelMapper();
    return mapper.map(partEntity, Part.class);
  }



}
