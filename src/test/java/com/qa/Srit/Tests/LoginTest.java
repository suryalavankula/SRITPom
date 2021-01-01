package com.qa.Srit.Tests;

import org.testng.annotations.Test;

import com.qa.Srit.Base.BaseTest;

public class LoginTest extends BaseTest{


	@Test
	public void LoginTest(){
		
		Lp.loginsetup(prop.getProperty("Username"), prop.getProperty("Password"));
	}
	
	
	
	
}
