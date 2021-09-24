package com.example.shapes;

public abstract class Shape implements ThreeDimensionalShape {

    public Shape(){
    }

    @Override
    public double surfaceArea() {
        return 0.0;
    }

    @Override
    public double volume() {
        return 0.0;
    }
}
