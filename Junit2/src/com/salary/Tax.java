package com.salary;

public class Tax {
	double db;
	public Tax(String string, String string2, int i) {
		// TODO Auto-generated constructor stub
	}
	public double calculator(String name, String isIndian, double salary) {
		if((isIndian.equals("yes"))&&salary>100000)
			
	 db = (salary*8)/100;
		return db;
	}

	
	}
	

