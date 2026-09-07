package com.mycompany.ashape;

/**
 *
 * @author Nuri
 */
public class CompositeShape extends AShape {
    private AShape bottom;
    private AShape top;

    public CompositeShape(AShape bottom, AShape top) {
        this.bottom = bottom;
        this.top = top;
    }
}
