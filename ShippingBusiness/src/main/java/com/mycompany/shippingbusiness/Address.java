package com.mycompany.shippingbusiness;

public class Address {
    private String streetName;
    private int streetNum;
    private String city;

    public Address(String streetName, int streetNum, String city) {
        this.setStreetName(streetName);
        this.setStreetNum(streetNum);
        this.setCity(city);
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
