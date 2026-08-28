package com.mycompany.realestate;

/**
 * Bai 3.1.3 - dia chi cua 1 can nha
 *
 * @author Nuri
 */
public class Address {
    private int houseNumber;
    private String street;
    private String city;

    public Address(int houseNumber, String street, String city) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }
}
