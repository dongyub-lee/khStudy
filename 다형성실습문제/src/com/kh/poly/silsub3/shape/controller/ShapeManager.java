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
			System.out.println(iarr[i] + "의 면적은 " + iarr[i].area()
					+"입니다.");
			System.out.println(iarr[i] + "의 둘레는" + iarr[i].perimeter()
					+"입니다. ");
			
			if(iarr[i] instanceof Triangle) {
				System.out.println(iarr[i] + "의 빗변길이는 "
						+((Triangle)iarr[i]).getHypotenuse()
						+"입니다.");
			}
			System.out.println();
			
		}
		
	}
	
	
}
