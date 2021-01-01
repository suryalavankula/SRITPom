package com.qa.Srit.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.Srit.Base.BasePage;

public class ElementUtil {
	
	private WebDriver driver;
	JsUtil jsu;
	
	
	public ElementUtil(WebDriver driver){
		
		this.driver = driver;
		jsu = new JsUtil(driver);
	}
	
	public WebElement getElement(By Locator){
	
		WebElement ele = driver.findElement(Locator);
		
		if(Boolean.parseBoolean(BasePage.flashElement)) jsu.flash(ele);
		
		return ele;
	}
	
	public void doSendKeys(By Locator, String Value){

		getElement(Locator).sendKeys(Value);
		
	}
	
	public void doClik(By Locator){
		
		getElement(Locator).click();
		
		
	}
	
	public boolean isElementDisplayed(By Locator){
	
		return getElement(Locator).isDisplayed();
		
	}

}
