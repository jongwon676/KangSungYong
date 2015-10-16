package com.j2.factory.newCase;

public class ShapeDrive {
    public static void main(String ar[]){
    	SimpleShapeFactory fac=new SimpleShapeFactory();
        Shape shape1=fac.createShape("circle");
        Shape shape2=fac.createShape("oval");
        Shape shape3=fac.createShape("rectangle");
        shape1.draw();
        shape2.draw();
        shape3.draw();
        		
    }
}
