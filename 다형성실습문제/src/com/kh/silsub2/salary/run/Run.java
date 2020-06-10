package com.kh.silsub2.salary.run;

import java.util.Scanner;

import com.kh.silsub2.controller.CalculateImpl;
import com.kh.silsub2.salary.model.vo.PayTable;
import com.kh.silsub2.salary.model.vo.Salary;

public class Run {
	public static void main(String[] args) {
		Salary[] pt = new Salary[3];
		pt[0] = new PayTable("소서노" , 7500000, 2, 3);
		pt[1] = new PayTable("고주몽",800000,1,4);
		pt[2] = new PayTable("모팔모",650000,6,2);
		
		CalculateImpl.calc(pt);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("인센티브(%) 입력 : ");
		float in = sc.nextFloat();
		
		System.out.println("                                        **** 급여명세서 ****");
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("이름      기본급    가족수   가족수당   시간외근무  시간외수당 세금  인센티브(%)  성과금   실수령액");
		System.out.println("---------------------------------------------------------------------------------------------------");
	
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("인원수 : " + Salary.getCount());
	
	}
}
