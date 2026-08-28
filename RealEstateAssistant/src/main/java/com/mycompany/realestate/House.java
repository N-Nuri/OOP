package com.mycompany.realestate;

/**
 * Bai 3.1.3 - Real Estate Assistant
 *
 * @author Nuri
 */
public class House {
    private String kind;
    private int numRooms;
    private Address address;
    private double askingPrice;

    public House(String kind, int numRooms, Address address, double askingPrice) {
        this.kind = kind;
        this.numRooms = numRooms;
        this.address = address;
        this.askingPrice = askingPrice;
    }

    public String getKind() {
        return kind;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public Address getAddress() {
        return address;
    }

    public double getAskingPrice() {
        return askingPrice;
    }

    // xac dinh nha nay co nhieu phong hon nha kia khong
    public boolean hasMoreRooms(House other) {
        return this.numRooms > other.numRooms;
    }

    // kiem tra nha co nam trong thanh pho cho truoc khong
    public boolean inThisCity(String city) {
        return this.address.getCity().equals(city);
    }

    // xac dinh nha nay co cung thanh pho voi nha kia khong
    public boolean sameCity(House other) {
        return this.address.getCity().equals(other.address.getCity());
    }
}
