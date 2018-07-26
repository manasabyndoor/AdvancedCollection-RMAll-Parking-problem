package com.salary;

import org.junit.Test;

import junit.framework.Assert;


public class TaxCalculator {


	@Test
	public void calculateTaxwhenIndian(String name,String isIndian,double salary) {
	Tax tax=new Tax(isIndian, isIndian, 0);
	
	
		double taxamount=tax.calculator("Ron","yes",150000.00);
		System.out.println(taxamount);
		
		Assert.assertEquals(12000.0, taxamount);
	
	}
	

}
