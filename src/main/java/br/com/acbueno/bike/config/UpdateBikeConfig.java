package br.com.acbueno.bike.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import br.com.acbueno.bike.core.usecase.impl.UpdateBikeUseCaseImpl;
import br.com.acbueno.bike.dataprovider.UpdateBikeImpl;

@Configuration
public class UpdateBikeConfig {

  @Bean
  public UpdateBikeUseCaseImpl updateBikeUseCaseImpl(UpdateBikeImpl updateBike) {
    return new UpdateBikeUseCaseImpl(updateBike);
  }

}
