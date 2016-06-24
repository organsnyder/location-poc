package com.snyder616.locationpoc.model;

public class Location {
  private final long id;
  private final String name;
  private final String address1;
  private final String address2;
  private final String city;
  private final String state;
  private final String zip;

  public Location(long id, String name, String address1, String address2, String city, String state,
      String zip) {
    this.id = id;
    this.name = name;
    this.address1 = address1;
    this.address2 = address2;
    this.city = city;
    this.state = state;
    this.zip = zip;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getAddress1() {
    return address1;
  }

  public String getAddress2() {
    return address2;
  }

  public String getCity() {
    return city;
  }

  public String getState() {
    return state;
  }

  public String getZip() {
    return zip;
  }
}
