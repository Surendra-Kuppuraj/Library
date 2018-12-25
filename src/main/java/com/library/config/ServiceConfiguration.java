/**
 * 
 */
package com.library.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Surendra Kumar
 *
 */
@Configuration
@ComponentScan({"com.library.service"})
public class ServiceConfiguration {

  public ServiceConfiguration() {
    super();
  }

}
