package com.kh.silsub2.controller;

import com.kh.silsub2.salary.model.vo.Salary;

public interface Calculate {
	void calc(Salary[] sarr); 		//급여계산용
	void out(Salary[] sarr);		//출력용
}
