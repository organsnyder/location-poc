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
    repo.add(create(1, "Worden Cafe", "25 Ottawa Ave SW", null, "Grand Rapids", "MI", "49503"));
    repo.add(create(2, "25 Eattawa", "Nowhere", null, "Hell", "MI", "48169"));
  }

  private Location create(long id, String name, String address1, String address2, String city, String state, String zip) {
    Location.Builder b = new Location.Builder();
    return b.id(id).name(name).address1(address1).address2(address2).city(city).state(state).zip(zip).build();
  }
}
