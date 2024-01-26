package br.com.acbueno.bike.dataprovider.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.acbueno.bike.dataprovider.repository.entity.BikeEntity;

public interface BikeRepository extends JpaRepository<BikeEntity, Long> {

}
