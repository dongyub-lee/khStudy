package com.kh.poly.silsub2.shape.model.vo;

public class Circle implements IShape {
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
		
		return PI*radius*radius;
	}

	@Override
	public double perimeter() {
		
		return 2*PI * radius;
	}
	
	@Override
	public String toString() {
		return "¿ø";
	}

}
