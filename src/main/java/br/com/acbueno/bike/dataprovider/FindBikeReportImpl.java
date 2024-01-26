package br.com.acbueno.bike.dataprovider;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.acbueno.bike.core.dataprovider.FindReport;
import br.com.acbueno.bike.core.domain.BikeReport;
import br.com.acbueno.bike.core.domain.Part;
import br.com.acbueno.bike.dataprovider.repository.BikeRepository;
import br.com.acbueno.bike.dataprovider.repository.PartRepository;
import br.com.acbueno.bike.dataprovider.repository.entity.BikeEntity;
import br.com.acbueno.bike.dataprovider.repository.entity.PartEntity;
import br.com.acbueno.bike.dataprovider.repository.mapper.PartRepositoyMapper;

@Component
public class FindBikeReportImpl implements FindReport {

  @Autowired
  private BikeRepository bikeRespository;

  @Autowired
  private PartRepository partRepository;

  @Override
  public List<BikeReport> listBikeReport() {
    List<BikeReport> listBikeReports = new ArrayList<>();

    for (BikeEntity bikeEntity : bikeRespository.findAll()) {
      BikeReport bikeReport = new BikeReport();
      List<Part> listPart = new ArrayList<>();

      for (PartEntity partEntity : partRepository.findAll()) {
        if (bikeEntity.getId() == partEntity.getBike().getId()) {
          listPart.add(PartRepositoyMapper.toPart(partEntity));
          bikeReport.setIdBike(bikeEntity.getId());
          bikeReport.setBrand(bikeEntity.getBrand());
          bikeReport.setType(bikeEntity.getType());
        }
        bikeReport.setListPart(listPart);
      }
      listBikeReports.add(bikeReport);
    }

    return listBikeReports;
  }

  @Override
  public BikeReport findByBikeId(Long id) {
    BikeReport bikeReport = new BikeReport();
    List<Part> listPart = new ArrayList<>();
    Optional<BikeEntity> bike = bikeRespository.findById(id);

    for (PartEntity partEntity : partRepository.findAll()) {
      bikeReport.setIdBike(bike.get().getId());
      bikeReport.setBrand(bike.get().getBrand());
      bikeReport.setType(bike.get().getType());
      if (bike.get().getId() == partEntity.getBike().getId()) {
        listPart.add(PartRepositoyMapper.toPart(partEntity));
      }
    }
    bikeReport.setListPart(listPart);

    return bikeReport;
  }

}
