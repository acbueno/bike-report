package br.com.acbueno.bike.dataprovider;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.acbueno.bike.core.dataprovider.UpdatePart;
import br.com.acbueno.bike.core.domain.Part;
import br.com.acbueno.bike.dataprovider.repository.PartRepository;
import br.com.acbueno.bike.dataprovider.repository.entity.PartEntity;

@Component
public class UpdatePartImpl implements UpdatePart {

  @Autowired
  private PartRepository repository;

  @Override
  public void update(Part part) {
    Optional<PartEntity> partEntity = repository.findById(part.getId());
    if (partEntity.isPresent()) {
      partEntity.get().setPart(part.getPart());
      partEntity.get().setBrand(part.getBrand());
      partEntity.get().setPartDescription(part.getPartDescription());
      repository.save(partEntity.get());
    }
  }

}
