package br.com.acbueno.bike.dataprovider;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.acbueno.bike.core.dataprovider.FindPart;
import br.com.acbueno.bike.core.domain.Part;
import br.com.acbueno.bike.dataprovider.repository.PartRepository;
import br.com.acbueno.bike.dataprovider.repository.entity.PartEntity;
import br.com.acbueno.bike.dataprovider.repository.mapper.PartRepositoyMapper;

@Component
public class FindPartImpl implements FindPart {

  @Autowired
  private PartRepository repository;

  @Override
  public List<Part> findAll() {
    List<Part> listPart = new ArrayList<>();
    List<PartEntity> findAll = repository.findAll();
    findAll.forEach(it -> {
      var partEntity = PartRepositoyMapper.toPart(it);
      listPart.add(partEntity);
    });
    return listPart;
  }

  @Override
  public Part findById(Long id) {
    var part = repository.findById(id).get();
    return PartRepositoyMapper.toPart(part);
  }

}
