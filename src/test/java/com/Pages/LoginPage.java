package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="login-username") WebElement txtEmail;
	@FindBy(id="login-password") WebElement txtPassword;
	@FindBy(name="remember") WebElement checkRemember;
	@FindBy(name="submit") WebElement btnLogIn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void email(String email)
	{
		txtEmail.sendKeys(email);
	}
	public void password(String password)
	{
		txtPassword.sendKeys(password);
	}
	public void remember()
	{
		checkRemember.click();
	}
	public void signIn()
	{
		btnLogIn.click();
	}
}
