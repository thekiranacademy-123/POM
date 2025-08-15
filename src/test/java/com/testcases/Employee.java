package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Employee {
	@Test
	void test()
	{
		System.out.println("Tst Excution Started");
		Assert.assertEquals("Hello", "Hello");
		Assert.assertEquals(2,4);
		System.err.println("changes in employee file");
	}
}
