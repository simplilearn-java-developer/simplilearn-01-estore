package com.simplilearn.estore.admin.model;

public class Users {

    String street;
    String city;
    String state;
    String country;
    Integer pincode;

    public Users() {
    }

    public Users(String street, String city, String state, String country, Integer pincode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }
    
    @Override
    public String toString() {
        return "Users [street=" + street + ", city=" + city + ", state=" + state + ", country=" + country + ", pincode=" + pincode + "]";
    }

}
