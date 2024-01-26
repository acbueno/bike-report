package br.com.acbueno.bike.core.domain;

public class Part {

  private Long id;

  private String part;

  private String partDescription;

  private String brand;

  private Long bikeId;

  public Part() {}

  public Part(Long id, String part, String partDescription, String brand) {
    this.id = id;
    this.part = part;
    this.partDescription = partDescription;
    this.brand = brand;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getPart() {
    return part;
  }

  public void setPart(String part) {
    this.part = part;
  }

  public String getPartDescription() {
    return partDescription;
  }

  public void setPartDescription(String partDescription) {
    this.partDescription = partDescription;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Long getBikeId() {
    return bikeId;
  }

  public void setBikeId(Long bikeId) {
    this.bikeId = bikeId;
  }

}
