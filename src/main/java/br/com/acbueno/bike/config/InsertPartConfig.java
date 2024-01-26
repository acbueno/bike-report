package br.com.acbueno.bike.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import br.com.acbueno.bike.core.usecase.impl.InsertPartUseCaseImpl;
import br.com.acbueno.bike.dataprovider.InsertPartImpl;

@Configuration
public class InsertPartConfig {

  @Bean
  public InsertPartUseCaseImpl insertPartUseCaseImpl(InsertPartImpl insertPartImpl) {
    return new InsertPartUseCaseImpl(insertPartImpl);
  }

}
