package com.kh.poly.silsub3.shape.model.vo;

import com.kh.poly.silsub2.shape.model.vo.IShape;

public class Triangle implements IShape {
	private double base;		//¹Øº¯
	private double height;		//³ôÀÌ
	
	public Triangle() {}
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		// »ï°¢ÇüÀÇ ³ĞÀÌ
		return ( base * height ) / 2;
	}
	
	public double getHypotenuse() {
		return Math.sqrt(base*base + height * height);
	}

	@Override
	public double perimeter() {
		// »ï°¢ÇüÀÇ µÑ·¹±æÀÌ
		return base + height + getHypotenuse();
	}

	@Override
	public String toString() {
		return "»ï°¢Çü";
	}
	
	
}
