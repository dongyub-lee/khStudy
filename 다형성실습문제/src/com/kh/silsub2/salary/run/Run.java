package com.kh.silsub2.salary.run;

import java.util.Scanner;

import com.kh.silsub2.salary.model.vo.CalculateImpl;
import com.kh.silsub2.salary.model.vo.OutputImpl;
import com.kh.silsub2.salary.model.vo.PayTable;
import com.kh.silsub2.salary.model.vo.Salary;

public class Run {
	public static void main(String[] args) {
		Salary[] pt = new Salary[3];
		pt[0] = new PayTable("�Ҽ���" , 750000, 2, 3);
		pt[1] = new PayTable("���ָ�",800000,1,4);
		pt[2] = new PayTable("���ȸ�",650000,6,2);
		
		CalculateImpl cal = new CalculateImpl();
		cal.calc(pt);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�μ�Ƽ��(%) �Է� : ");
		float in = sc.nextFloat();
		
		OutputImpl outp = new OutputImpl();
		outp.out(pt);
	
	}
}
