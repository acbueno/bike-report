package br.com.acbueno.bike.entrypoint.controller.request;

import lombok.Data;

@Data
public class PartRequest {

  private String part;

  private String partDescription;

  private String brand;

  private Long bikeId;

}
