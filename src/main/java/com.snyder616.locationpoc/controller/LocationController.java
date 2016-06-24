package com.snyder616.locationpoc.controller;

import com.snyder616.locationpoc.model.Location;
import com.snyder616.locationpoc.store.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.Optional;

@Controller
public class LocationController {
  @Autowired
  private LocationRepository repo;

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public
  @ResponseBody
  Location get(@PathVariable(value = "id") long id) {
    Optional<Location> location = repo.getById(id);
    if (location.isPresent()) {
      return location.get();
    }
    throw new LocationNotFoundException(id);
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public @ResponseBody List<Location> list() {
    return repo.getLocations();
  }

  @ResponseStatus(value = HttpStatus.NOT_FOUND)
  public static class LocationNotFoundException extends RuntimeException {
    LocationNotFoundException(long id) {
      super("Location not found: " + id);
    }
  }
}
