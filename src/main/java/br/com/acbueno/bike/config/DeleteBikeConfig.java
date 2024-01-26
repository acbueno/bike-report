package br.com.acbueno.bike.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import br.com.acbueno.bike.core.usecase.impl.DeleteBikeUseCaseImpl;
import br.com.acbueno.bike.dataprovider.DeleteBikePartImpl;

@Configuration
public class DeleteBikeConfig {

  @Bean
  public DeleteBikeUseCaseImpl deleteBikeUseCaseImpl(DeleteBikePartImpl deletePartImpl) {
    return new DeleteBikeUseCaseImpl(deletePartImpl);
  }

}
