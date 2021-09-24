package com.example.shapes;

public class SquarePyramid extends Shape {
    private double height;
    private double width;
    private double slantHeight;

    public SquarePyramid() {
        super();
        this.width = 0.0;
        this.height = 0.0;
    }

    public SquarePyramid(double height, double width) {
        super();
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double surfaceArea() {
        return Math.pow(width, 2) + ((2.0 * width ) * (Math.sqrt(( (Math.pow(width,2)) /4.0) + Math.pow(height,2))));
    }

    @Override
    public double volume() {
        return (Math.pow(width,2)) * (height/3.0);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Square Pyramid {");
        sb.append("height=").append(height);
        sb.append(", width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
