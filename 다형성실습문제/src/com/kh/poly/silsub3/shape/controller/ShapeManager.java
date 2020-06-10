package com.kh.poly.silsub3.shape.controller;

import com.kh.poly.silsub2.shape.model.vo.Circle;
import com.kh.poly.silsub2.shape.model.vo.IShape;
import com.kh.poly.silsub2.shape.model.vo.Rectangle;
import com.kh.poly.silsub3.shape.model.vo.Triangle;

public class ShapeManager {
	
	public void calcShapeArray() {
		IShape[] iarr = new IShape[5];
		iarr[0] = new Circle(2.3);
		iarr[1] = new Rectangle(4.11, 1.19);
		iarr[2] = new Triangle(2.3, 1.19 );
		iarr[3] = new Circle(5.25);
		iarr[4] = new Rectangle(4.11, 2.3);
		
		for(int i = 0; i<iarr.length ; i++) {
			System.out.println(iarr[i] + "�� ������ " + iarr[i].area()
					+"�Դϴ�.");
			System.out.println(iarr[i] + "�� �ѷ���" + iarr[i].perimeter()
					+"�Դϴ�. ");
			
			if(iarr[i] instanceof Triangle) {
				System.out.println(iarr[i] + "�� �������̴� "
						+((Triangle)iarr[i]).getHypotenuse()
						+"�Դϴ�.");
			}
			System.out.println();
			
		}
		
	}
	
	
}
