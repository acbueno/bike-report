package br.com.acbueno.bike.entrypoint.controller.response;

import java.util.List;
import lombok.Data;

@Data
public class BikeReportResponse {

  private Long idBike;

  private String brand;

  private String type;

  private List<PartResponse> listPart;

}
