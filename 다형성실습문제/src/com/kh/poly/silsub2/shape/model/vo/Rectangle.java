package com.kh.poly.silsub2.shape.model.vo;

public class Rectangle implements IShape{
	double width;
	double height;
	
	public Rectangle() {}
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double area() {
		
		return width * height;
	}

	@Override
	public double perimeter() {
		
		return 2*(width* height);
	}
	
	@Override
	public String toString() {
		return "»ç°¢Çü";
	}

}
