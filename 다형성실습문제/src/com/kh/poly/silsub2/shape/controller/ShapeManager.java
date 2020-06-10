package com.kh.poly.silsub2.shape.controller;


import com.kh.poly.silsub2.shape.model.vo.Circle;
import com.kh.poly.silsub2.shape.model.vo.IShape;
import com.kh.poly.silsub2.shape.model.vo.Rectangle;

public class ShapeManager {
	public void calcShape() {
		IShape s;

		s =  new Circle(15.5);
		System.out.println("������ : " + s.area());
		System.out.println("���ѷ� : " + s.perimeter());

		s = new Rectangle(34.5, 42.7);
		System.out.println("�簢������ : " + s.area());
		System.out.println("�簢���ѷ� : " + s.perimeter());
	}
}
