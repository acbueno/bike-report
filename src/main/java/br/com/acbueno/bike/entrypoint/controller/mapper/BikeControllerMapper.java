package br.com.acbueno.bike.entrypoint.controller.mapper;

import org.modelmapper.ModelMapper;
import br.com.acbueno.bike.core.domain.Bike;
import br.com.acbueno.bike.entrypoint.controller.request.BikeRequest;
import br.com.acbueno.bike.entrypoint.controller.response.BikeResponse;

public class BikeControllerMapper {

  public static Bike toBike(BikeRequest bikeRequest) {
    ModelMapper mapper = new ModelMapper();
    return mapper.map(bikeRequest, Bike.class);
  }

  public static BikeRequest toBikeRequest(Bike bike) {
    ModelMapper mapper = new ModelMapper();
    return mapper.map(bike, BikeRequest.class);
  }

  public static BikeResponse toBikeResponse(Bike bike) {
    ModelMapper mapper = new ModelMapper();
    return mapper.map(bike, BikeResponse.class);
  }

}
