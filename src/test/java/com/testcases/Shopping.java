package com.testcases;

public class Shopping {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		//flipcart
		Bank b1= new Bank();
		b1.setName("flipcart");
		b1.start();
		//amazon
		Bank b2= new Bank();
		b2.setName("amazon");
		b2.start();
				
	}

}
