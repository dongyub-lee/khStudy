package com.kh.silsub2.controller;

import com.kh.silsub2.salary.model.vo.Salary;

public class CalculateImpl implements Calculate {

	@Override
	public void calc(Salary[] sarr) {
		
		if(sarr.getFamily()<3) {
			sarr.setFamilyP(sarr.getFamily() * 20000)
		} else {
			sarr.setFamilyP(sarr.getFamily() * 60000);
		}
		
		sarr.setOvertimeP(sarr[].getOvertime() * 5000);
		sarr.setTax(sarr.getPay() * 0.1);
		sarr.setIncenP(sarr.getIncentive() * sarr.getPay());
		sarr.setTotalPay(sarr.getPay()+ sarr.getFamilyP()
				+ sarr.getIcenP() + sarr.getOvertimeP()
				- sarr.getTax());
		
	}

	@Override
	public void out(Salary[] sarr) {
		// TODO Auto-generated method stub
		
	}

}
