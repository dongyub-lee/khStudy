package com.kh.poly.silsub1.shape.model.vo;

public class Circle extends Shape {
	private static final double PI = Math.PI;
	double radius;
	
	public Circle() {}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		
		return radius*radius*PI;
	}

	@Override
	public double perimeter() {
		
		return 2*PI*radius;
	}
	
	
	
}
