package com.j2.factory.newCase;

public class SimpleShapeFactory {
    Shape shape;
	public Shape createShape(String type){
	if(type.equals("circle")){
		shape=new Circle();
	}
	else if(type.equals("oval")){
		shape=new Oval();
	}
	else if(type.equals("rectangle")){
		shape=new Rectangle();
	}
		

	
	return shape;
}
}
