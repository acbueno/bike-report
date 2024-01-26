package br.com.acbueno.bike.dataprovider.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.acbueno.bike.dataprovider.repository.entity.PartEntity;

@Repository
public interface PartRepository extends JpaRepository<PartEntity, Long> {

}
