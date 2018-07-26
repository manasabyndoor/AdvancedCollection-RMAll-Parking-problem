package com.capgemini;
import junit.framework.Assert;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import org.junit.Ignore;
public class SubtractionTest {

	@Test
	public void Subtractiontest2Psitive	 () {
		Maths math=new Maths();
		int answer=math.subtract(2,2);
		
		Assert.assertEquals(0, answer);
	}
	@Test
	public void Subtraction2negative() {
		Maths math=new Maths();
		int answer=math.subtract(-2,-2);
		
		Assert.assertEquals(0, answer);
	}
	
	@Test
	public void SubractionNegativegreater() {
		Maths math=new Maths();
		int answer=math.subtract(-8,2);
		
		Assert.assertEquals(-10, answer);
	}
	
	@Test
	public void SubractionPositivegreater() {
		Maths math=new Maths();
		int answer=math.subtract(2,-2);
		
		Assert.assertEquals(4, answer);
	}

}
