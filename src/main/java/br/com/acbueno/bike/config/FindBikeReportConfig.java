package br.com.acbueno.bike.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import br.com.acbueno.bike.core.usecase.impl.FindBikeReportUseCaseImpl;
import br.com.acbueno.bike.dataprovider.FindBikeReportImpl;

@Configuration
public class FindBikeReportConfig {

  @Bean
  public FindBikeReportUseCaseImpl findBikeReportUseCaseImpl(FindBikeReportImpl findBikeReport) {
    return new FindBikeReportUseCaseImpl(findBikeReport);
  }

}
