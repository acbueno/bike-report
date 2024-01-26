package br.com.acbueno.bike.entrypoint.controller.mapper;

import org.modelmapper.ModelMapper;
import br.com.acbueno.bike.core.domain.Part;
import br.com.acbueno.bike.entrypoint.controller.request.PartRequest;
import br.com.acbueno.bike.entrypoint.controller.response.PartResponse;

public class PartControllerMapper {

  public static Part toPart(PartRequest partRequest) {
    ModelMapper mapper = new ModelMapper();
    mapper.typeMap(PartRequest.class, Part.class).addMappings(mp -> {
      mp.skip(Part::setId);
    });
    return mapper.map(partRequest, Part.class);
  }

  public static PartResponse toPartResponse(Part part) {
    ModelMapper mapper = new ModelMapper();
    return mapper.map(part, PartResponse.class);
  }

}
