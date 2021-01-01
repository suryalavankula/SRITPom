package com.qa.Srit.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Srit.Base.BaseTest;	
import com.qa.Srit.Pages.HomePage;

public class HomeTest extends BaseTest{

	private WebDriver driver;
	HomePage Hp;
	
	
		@BeforeClass
		public void homePageSetup(){
		 Hp = Lp.loginsetup(prop.getProperty("Username"), prop.getProperty("Password"));
		}
	
	
	@Test
	public void manageTextTest(){
		  Assert.assertTrue(Hp.ValidMangetext());
	
	}
	

	
	
	
}
