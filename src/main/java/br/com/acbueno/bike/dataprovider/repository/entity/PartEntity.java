package br.com.acbueno.bike.dataprovider.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "part")
public class PartEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "part", nullable = false, length = 255)
  private String part;

  @Column(name = "brand", nullable = false, length = 255)
  private String brand;

  @Column(name = "part_description", nullable = false)
  private String partDescription;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "bike_id", nullable = false)
  private BikeEntity bike;

}
