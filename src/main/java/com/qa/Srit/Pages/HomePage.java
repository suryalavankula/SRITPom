package com.qa.Srit.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.Srit.Base.BasePage;
import com.qa.Srit.Utils.ElementUtil;

public class HomePage extends BasePage {
	
	 private WebDriver driver;
	 ElementUtil Util;
	 
	 By Mangetext = By.xpath("//span[text()=' Manage ']");
	 
	 public HomePage(WebDriver driver){
		 this.driver = driver;
		 Util = new ElementUtil(driver);
	 }
	 
	 public boolean ValidMangetext(){
		 
		return Util.isElementDisplayed(Mangetext);
		 
	 }
	 
	 
	 
	

}
