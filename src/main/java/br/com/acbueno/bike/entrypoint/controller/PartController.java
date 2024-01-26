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
import br.com.acbueno.bike.core.domain.Part;
import br.com.acbueno.bike.core.usecase.DeletePartUseCase;
import br.com.acbueno.bike.core.usecase.FindPartUseCase;
import br.com.acbueno.bike.core.usecase.InsertPartUseCase;
import br.com.acbueno.bike.core.usecase.UpdatePartUseCase;
import br.com.acbueno.bike.entrypoint.controller.mapper.PartControllerMapper;
import br.com.acbueno.bike.entrypoint.controller.request.PartRequest;
import br.com.acbueno.bike.entrypoint.controller.response.PartResponse;

@RestController
@RequestMapping("/api/v1/part")
public class PartController {

  @Autowired
  private InsertPartUseCase insertPartUseCase;

  @Autowired
  private FindPartUseCase findPartUseCase;

  @Autowired
  private UpdatePartUseCase updatePartUseCase;

  @Autowired
  private DeletePartUseCase deletePartUseCase;

  @PostMapping()
  public ResponseEntity<Void> insert(@RequestBody PartRequest partRequest) {
    var part = PartControllerMapper.toPart(partRequest);
    insertPartUseCase.insert(part);
    return ResponseEntity.ok().build();
  }

  @GetMapping
  public ResponseEntity<List<PartResponse>> findAllPart() {
    List<PartResponse> listResponse = new ArrayList<>();
    for (Part item : findPartUseCase.findAll()) {
      listResponse.add(PartControllerMapper.toPartResponse(item));
    }
    return ResponseEntity.ok().body(listResponse);
  }

  @GetMapping("/{id}")
  public ResponseEntity<PartResponse> findById(@PathVariable("id") Long id) {
    var partResponse = PartControllerMapper.toPartResponse(findPartUseCase.findById(id));
    return ResponseEntity.ok().body(partResponse);
  }

  @PutMapping("/{id}")
  public ResponseEntity<PartResponse> updateById(@PathVariable("id") Long id,
      PartRequest partRequest) {
    Part part = findPartUseCase.findById(id);
    part.setPart(partRequest.getPart());
    part.setBrand(partRequest.getBrand());
    part.setPartDescription(partRequest.getPartDescription());
    updatePartUseCase.update(part);

    return ResponseEntity.ok().body(PartControllerMapper.toPartResponse(part));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
    this.deletePartUseCase.delete(id);
    return ResponseEntity.ok().build();
  }
}
