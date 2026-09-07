package com.mycompany.ashape;

/**
 *
 * @author Nuri
 */
public class Square extends AShape {
    private CartesianPoint location;
    private int size;

    public Square(CartesianPoint location, int size) {
        this.location = location;
        this.size = size;
    }
}
