package com.kh.silsub2.salary.model.vo;

import com.kh.silsub2.view.Output;

public class OutputImpl implements Output {

	@Override
	public void out(Salary[] sarr) {
		
		// TODO Auto-generated method stub
		System.out.println("                                        **** �޿����� ****");
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("�̸�       �⺻��        ������    ��������    �ð��ܱٹ�    �ð��ܼ���    ����            �μ�Ƽ��(%)   ������      �Ǽ��ɾ�");
		System.out.println("---------------------------------------------------------------------------------------------------");
		for(int i = 0 ; i < sarr.length ; i++) {
			System.out.println(sarr[i].getName() + "    " + sarr[i].getPay() +"    "
					+sarr[i].getFamily() + "    " + sarr[i].getFamilyP() + "    " 
					+sarr[i].getOvertime() + "    " + sarr[i].getOvertimeP()+ "    " 
					+sarr[i].getTax()+ "    " + sarr[i].getIncentive()+ "    " 
					+sarr[i].getIncenP() + "    " + sarr[i].getTotalPay());
		}
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		for(int i = 0 ; i< sarr.length ; i++) {
			if(i == sarr.length) {
		System.out.println("�ο��� : " + sarr[i].getCount());
			}
		}
	}

}
