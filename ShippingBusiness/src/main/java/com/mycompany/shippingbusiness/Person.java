package com.mycompany.shippingbusiness;

public class Person {
    private String name;
    private String phoneNumber;
    private Address address;

    public Person(String name, String phoneNumber, Address address) {
        this.setName(name);
        this.setPhoneNumber(phoneNumber);
        this.setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
