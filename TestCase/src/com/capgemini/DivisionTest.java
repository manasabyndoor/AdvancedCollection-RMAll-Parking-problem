package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class DivisionTest {

	@Test
	public void Divisiontest2Psitive	 () {
		Maths math=new Maths();
		int answer=math.divide(2,2);
		
		Assert.assertEquals(1, answer);
	}
	@Test
	public void Division2negative() {
		Maths math=new Maths();
		int answer=math.divide(-2,-2);
		
		Assert.assertEquals(1, answer);
	}
	
	@Test
	public void DivisionNegativegreater() {
		Maths math=new Maths();
		int answer=math.divide(-8,2);
		
		Assert.assertEquals(-4, answer);
	}
	
	@Test
	public void DivisionPositivegreater() {
		Maths math=new Maths();
		int answer=math.divide(8,-2);
		
		Assert.assertEquals(-4, answer);
	}
	@Test(expected=java.lang.ArithmeticException.class)
	public void throwsExceptionwhenDivisionZero() {
		Maths math=new Maths();
		int answer=math.divide(8,0);
		
		//Assert.assertEquals(-4, answer);
	}


}
