package com.snyder616.locationpoc.store;

import com.snyder616.locationpoc.model.Location;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class LocationRepository {
  private Map<Long, Location> idsToLocations = new HashMap<>();

  public Optional<Location> getById(long id) {
    return Optional.ofNullable(idsToLocations.get(id));
  }

  public void add(Location location) {
    idsToLocations.put(location.getId(), location);
  }

  public List<Location> getLocations() {
    return Collections.unmodifiableList(new ArrayList<>(idsToLocations.values()));
  }
}
