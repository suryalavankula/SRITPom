package com.qa.Srit.Base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.Srit.Pages.LoginPage;
import com.qa.Srit.Utils.ElementUtil;

public class BaseTest {
	
	WebDriver driver;
	public BasePage Bp;
	public Properties prop;
	public LoginPage Lp;
	public ElementUtil Util;
	
	@BeforeTest
	public void Setup(){
		
		Bp = new BasePage();
		Bp.inti_Config();
		driver = Bp.inti_Browser();
		prop = Bp.prop;
		Lp = new LoginPage(driver);
		
	}
	
	@AfterTest
	public void Quit(){
		
		driver.quit();
	}
	
	
	

}
