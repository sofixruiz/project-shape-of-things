package com.example.shapes;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {

        ThreeDimensionalShape sphere = new Sphere(2.0);
        ThreeDimensionalShape cube = new Cube (5.0);
        ThreeDimensionalShape cylinder = new Cylinder(4.0,1.0);
        ThreeDimensionalShape cone = new Cone(3.0,2.0);
        ThreeDimensionalShape squarePyramid = new SquarePyramid(10.0,5.0);

        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);
        shapes.add(cone);
        shapes.add(squarePyramid);

        shapes.forEach(System.out::println);

    }
}
/*
Output:
Sphere {radius=2.0, surface area=50.26548245743669, volume=33.510321638291124}
Cube {width=5.0, surface area=150.0, volume=125.0}
Cylinder {height=4.0, radius=1.0, surface area=31.41592653589793, volume=12.566370614359172}
Cone {height=3.0, radius=2.0, surface area=35.22071741263713, volume=12.566370614359172}
Square Pyramid {height=10.0, width=5.0, surface area=128.07764064044153, volume=83.33333333333334}
 */