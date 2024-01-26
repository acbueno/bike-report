package br.com.acbueno.bike.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import br.com.acbueno.bike.core.usecase.impl.FindPartUseCaseImpl;
import br.com.acbueno.bike.dataprovider.FindPartImpl;

@Configuration
public class FindPartConfig {

  @Bean
  public FindPartUseCaseImpl findPartUseCaseImpl(FindPartImpl findPart) {
    return new FindPartUseCaseImpl(findPart);
  }

}
