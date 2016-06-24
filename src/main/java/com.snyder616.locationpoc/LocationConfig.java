package com.snyder616.locationpoc;

import com.snyder616.locationpoc.store.LocationRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LocationConfig {
  @Bean
  public LocationRepository locationRepository() {
    return new LocationRepository();
  }
}
