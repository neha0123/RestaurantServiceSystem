package org.example;

public class UserDetails {
   private final String name;
    private final String gender;
    private final String phoneNumber;
    private final String location;

  public   UserDetails(String name, String gender, String phoneNumber, String location){
        this.name=name;
        this.gender=gender;
        this.phoneNumber=phoneNumber;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getLocation() {
        return location;
    }
}
