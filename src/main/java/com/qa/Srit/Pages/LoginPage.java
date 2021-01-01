package com.qa.Srit.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.Srit.Utils.ElementUtil;

public class LoginPage  {

	private WebDriver driver;
	ElementUtil Util;
	
	//By Locators
	
	By Signinlink = By.xpath("//a[text()='sign in']");
	By Username = By.id("username");
	By Password = By.id("password");
	By SignButton = By.xpath("//button[text()='Sign in']");
	
	
	public LoginPage(WebDriver driver){
		
	         this.driver = driver;
	         Util = new ElementUtil(driver);
	}
	
	
	public HomePage loginsetup(String un,String pwd){
		
		Util.doClik(Signinlink);
		Util.doSendKeys(Username, un);
		Util.doSendKeys(Password, pwd);
		Util.doClik(SignButton);
		
		return new HomePage(driver);
	
	}
	
}
