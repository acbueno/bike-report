package br.com.acbueno.bike.core.dataprovider;

import java.util.List;
import br.com.acbueno.bike.core.domain.Part;

public interface FindPart {

  public List<Part> findAll();

  public Part findById(Long id);

}
