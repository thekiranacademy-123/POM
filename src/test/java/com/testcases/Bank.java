package com.testcases;

import java.time.LocalDateTime;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Bank extends Thread {

	public static int balance =1000;
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			withdraw(150);
			System.out.println("Money is Withrawed");
		}
	}
	public static synchronized void withdraw(int amt)
	{
		if(balance>=150)
		{
			System.out.println(Thread.currentThread().getName());
			balance =balance-amt;
			System.out.println("Remaining balance ="+ balance );
			System.out.println(LocalDateTime.now());
		}else
		{
			System.out.println("insuffient balance ");
		}
		
	}
}
