package com.mycompany.shippingbusiness;

public class Boxsize {
    private double width;
    private double length;
    private double height;

    public Boxsize(double width, double length, double height) {
        this.setWidth(width);
        this.setLength(length);
        this.setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
