package br.com.acbueno.bike.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import br.com.acbueno.bike.core.usecase.impl.FindBikeUseCaseImpl;
import br.com.acbueno.bike.dataprovider.FindBikeImpl;

@Configuration
public class FindBikeConfig {

  @Bean
  public FindBikeUseCaseImpl findBikeUseCaseImpl(FindBikeImpl findBike) {
    return new FindBikeUseCaseImpl(findBike);
  }

}
