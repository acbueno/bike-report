package br.com.acbueno.bike.entrypoint.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.acbueno.bike.core.domain.Bike;
import br.com.acbueno.bike.core.usecase.DeleteBikeUseCase;
import br.com.acbueno.bike.core.usecase.FindBikeUseCase;
import br.com.acbueno.bike.core.usecase.InsertBikeUseCase;
import br.com.acbueno.bike.core.usecase.UpdateBikeUseCase;
import br.com.acbueno.bike.entrypoint.controller.mapper.BikeControllerMapper;
import br.com.acbueno.bike.entrypoint.controller.request.BikeRequest;
import br.com.acbueno.bike.entrypoint.controller.response.BikeResponse;

@RestController
@RequestMapping("/api/v1/bike")
public class BikeController {

  @Autowired
  private InsertBikeUseCase insertBikeUseCase;

  @Autowired
  private DeleteBikeUseCase deleteBikeUse;

  @Autowired
  private FindBikeUseCase findBikeUserCase;

  @Autowired
  private UpdateBikeUseCase updateBikeUseCase;

  @PostMapping
  public ResponseEntity<Void> insert(@RequestBody BikeRequest bikeRequest) {
    var bike = BikeControllerMapper.toBike(bikeRequest);
    insertBikeUseCase.insert(bike);
    return ResponseEntity.ok().build();
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
    deleteBikeUse.deleteById(id);
    return ResponseEntity.ok().build();
  }

  @GetMapping
  public ResponseEntity<List<BikeResponse>> findAll() {
    List<BikeResponse> listResponse = new ArrayList<>();

    for (Bike item : findBikeUserCase.finalAll()) {
      listResponse.add(BikeControllerMapper.toBikeResponse(item));
    }
    return ResponseEntity.ok().body(listResponse);
  }

  @GetMapping("/{id}")
  public ResponseEntity<BikeResponse> findById(@PathVariable("id") Long id) {
    var bikeResponse = BikeControllerMapper.toBikeResponse(findBikeUserCase.findById(id));
    return ResponseEntity.ok().body(bikeResponse);
  }

  @PutMapping("/{id}")
  public ResponseEntity<BikeResponse> updateById(@PathVariable("id") Long id,
      @RequestBody BikeRequest bikeRequest) {
    Bike bike = findBikeUserCase.findById(id);
    bike.setBrand(bikeRequest.getBrand());
    bike.setType(bikeRequest.getType());
    updateBikeUseCase.update(bike);

    return ResponseEntity.ok().body(BikeControllerMapper.toBikeResponse(bike));
  }

}
