package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pages.LoginPage;

public class Login  {
	WebDriver driver;
	LoginPage lp;

	@BeforeMethod
	void setUo()
	{
		driver= new ChromeDriver();
		driver.get("https://javabykiran.in/other/CC/login");
	    lp= new LoginPage(driver);
	}
	@AfterMethod
	void tearDown()
	{
		driver.quit();
	}
	@Test
	void testInvalid()
	{
	 lp.email("ABC@gmail.com");
	 lp.password("ABC@123");
	 lp.remember();
	 lp.signIn();
	}
	@Test
	void testSymbol()
	{
	 lp.email("#$%^&");
	 lp.password("#^&");
	 lp.remember();
	 lp.signIn();
	}
	@Test
	void testspaces()
	{
	 lp.email(" ");
	 lp.password(" ");
	 lp.remember();
	 lp.signIn();
	}
}
