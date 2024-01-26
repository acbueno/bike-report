package br.com.acbueno.bike.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import br.com.acbueno.bike.core.usecase.impl.UpdatePartUseCaseImpl;
import br.com.acbueno.bike.dataprovider.UpdatePartImpl;

@Configuration
public class UpdatePartConfig {

  @Bean
  public UpdatePartUseCaseImpl updatePartUseCaseImpl(UpdatePartImpl updatePart) {
    return new UpdatePartUseCaseImpl(updatePart);
  }

}
