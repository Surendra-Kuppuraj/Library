package com.library.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan({"com.library.controller"})
@EnableWebMvc
public class WebConfiguration extends WebMvcConfigurerAdapter {

  public WebConfiguration() {
    super();
  }

  @Bean
  public ModelMapper getModelMapper() {
    return new ModelMapper();
  }
}
