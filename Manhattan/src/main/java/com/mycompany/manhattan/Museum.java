package com.mycompany.manhattan;

public class Museum extends Place {
    private double admissionPrice;

    public Museum(Location location, String name, double admissionPrice) {
        super(location, name);
        this.setAdmissionPrice(admissionPrice);
    }

    public double getAdmissionPrice() {
        return admissionPrice;
    }

    public void setAdmissionPrice(double admissionPrice) {
        this.admissionPrice = admissionPrice;
    }
}
