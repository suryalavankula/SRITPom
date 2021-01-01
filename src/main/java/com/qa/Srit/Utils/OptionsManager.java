package com.qa.Srit.Utils;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class OptionsManager {
	
	
	Properties prop;
	ChromeOptions co;
	FirefoxOptions fo;
	
	public OptionsManager(Properties prop){
		this.prop = prop;
	}
	
	public ChromeOptions getchromeOptions(){
		co = new ChromeOptions();
		if(Boolean.parseBoolean(prop.getProperty("incognito"))) co.addArguments("--incognito");
		if(Boolean.parseBoolean(prop.getProperty("headless"))) co.addArguments("--headless");
		return co;
		
	}
	
	public FirefoxOptions getFirefoxOptions(){
		fo = new FirefoxOptions();
		if(Boolean.parseBoolean(prop.getProperty("incognito"))) co.addArguments("--incognito");
		if(Boolean.parseBoolean(prop.getProperty("headless"))) co.addArguments("--headless");
		return fo;
		
	}

}
