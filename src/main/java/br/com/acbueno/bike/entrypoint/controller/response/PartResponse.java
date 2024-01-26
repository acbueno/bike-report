package br.com.acbueno.bike.entrypoint.controller.response;

import lombok.Data;

@Data
public class PartResponse {

  private String part;

  private String partDescription;

  private String brand;

  private Long bikeId;

}
