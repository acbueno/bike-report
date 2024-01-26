package br.com.acbueno.bike.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import br.com.acbueno.bike.core.usecase.impl.DeletePartUseCaseImpl;
import br.com.acbueno.bike.dataprovider.DeletePartImpl;

@Configuration
public class DeletePartConfig {

  @Bean
  public DeletePartUseCaseImpl deletePartUseCaseImpl(DeletePartImpl deletePartImpl) {
    return new DeletePartUseCaseImpl(deletePartImpl);
  }

}
