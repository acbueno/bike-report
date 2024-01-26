package br.com.acbueno.bike.entrypoint.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.acbueno.bike.core.usecase.FindBikeReportUseCase;
import br.com.acbueno.bike.entrypoint.controller.mapper.BikeReportControllerMapper;
import br.com.acbueno.bike.entrypoint.controller.response.BikeReportResponse;

@RestController
@RequestMapping("/api/v1/report")
public class BikeReportController {

  @Autowired
  private FindBikeReportUseCase reportUseCase;

  @GetMapping
  public ResponseEntity<List<BikeReportResponse>> listBikeReport() {
    List<BikeReportResponse> listBikeReport =
        BikeReportControllerMapper.toListBikeReport(reportUseCase.findAll());
    return ResponseEntity.ok().body(listBikeReport);
  }

  @GetMapping("/{bikeId}")
  public ResponseEntity<BikeReportResponse> getReportByBikeId(@PathVariable("bikeId") Long bikeId) {
    BikeReportResponse bikeRerportResponse =
        BikeReportControllerMapper.toBikeRerportResponse(reportUseCase.findByBikeId(bikeId));

    return ResponseEntity.ok().body(bikeRerportResponse);
  }

}
