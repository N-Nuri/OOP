package com.mycompany.manhattan;

public class Location {
    private String street;
    private int streetNum;

    public Location(String street, int streetNum) {
        this.setStreet(street);
        this.setStreetNum(streetNum);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }
}
