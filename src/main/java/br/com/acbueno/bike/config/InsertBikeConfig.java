package br.com.acbueno.bike.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import br.com.acbueno.bike.core.usecase.impl.InsertBikeUseCaseImpl;
import br.com.acbueno.bike.dataprovider.InsertBikeImpl;

@Configuration
public class InsertBikeConfig {

  @Bean
  public InsertBikeUseCaseImpl insertBikeUseCaseImpl(InsertBikeImpl insertBike) {
    return new InsertBikeUseCaseImpl(insertBike);
  }

}
