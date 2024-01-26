package br.com.acbueno.bike.core.domain;

import java.util.List;

public class BikeReport {

  private Long idBike;

  private String brand;

  private String type;

  private List<Part> listPart;

  public BikeReport() {}

  public BikeReport(String brand, String type, List<Part> listPart) {
    this.brand = brand;
    this.type = type;
    this.listPart = listPart;
  }

  public Long getIdBike() {
    return idBike;
  }

  public void setIdBike(Long idBike) {
    this.idBike = idBike;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public List<Part> getListPart() {
    return listPart;
  }

  public void setListPart(List<Part> listPart) {
    this.listPart = listPart;
  }

}
