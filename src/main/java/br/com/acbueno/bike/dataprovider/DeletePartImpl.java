package br.com.acbueno.bike.dataprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.acbueno.bike.core.dataprovider.DeletePart;
import br.com.acbueno.bike.dataprovider.repository.PartRepository;

@Component
public class DeletePartImpl implements DeletePart {

  @Autowired
  private PartRepository repository;

  @Override
  public void delete(Long id) {
    this.repository.deleteById(id);
  }

}
