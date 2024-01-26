package br.com.acbueno.bike.entrypoint.controller.mapper;

import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import br.com.acbueno.bike.core.domain.BikeReport;
import br.com.acbueno.bike.entrypoint.controller.response.BikeReportResponse;

public class BikeReportControllerMapper {

  public static BikeReportResponse toBikeRerportResponse(BikeReport bikeReport) {
    ModelMapper mapper = new ModelMapper();
    return mapper.map(bikeReport, BikeReportResponse.class);
  }

  public static List<BikeReportResponse> toListBikeReport(List<BikeReport> listBikeReport) {
    List<BikeReportResponse> listReportResponse = new ArrayList<>();
    ModelMapper mapper = new ModelMapper();
    for (BikeReport listItem : listBikeReport) {
      BikeReportResponse bikeRerport = mapper.map(listItem, BikeReportResponse.class);
      listReportResponse.add(bikeRerport);
    }
    return listReportResponse;
  }

}
