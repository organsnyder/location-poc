package com.snyder616.locationpoc;

import com.snyder616.locationpoc.model.Location;
import com.snyder616.locationpoc.store.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class RepoPopulator implements ApplicationListener<ApplicationReadyEvent> {
  @Autowired
  private LocationRepository repo;

  @Override
  public void onApplicationEvent(ApplicationReadyEvent event) {
    repo.add(new Location(1, "Worden Cafe", "25 Ottawa Ave SW", null, "Grand Rapids", "MI", "49503"));
    repo.add(new Location(2, "25 Eattawa", "Nowhere", null, "Hell", "MI", "48169"));
  }
}
