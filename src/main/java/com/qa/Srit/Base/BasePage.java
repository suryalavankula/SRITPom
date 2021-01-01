package com.qa.Srit.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.Srit.Utils.OptionsManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
WebDriver driver;
public Properties prop;
public OptionsManager om;
public static String flashElement;

public WebDriver inti_Browser(){
	
	String BrowserName = prop.getProperty("Browser");
	 om = new OptionsManager(prop);
	if(BrowserName.equalsIgnoreCase("Chrome")){
		flashElement = prop.getProperty("highlight").trim();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(om.getchromeOptions());
	}
	else if(BrowserName.equalsIgnoreCase("Filefrox")){
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	else {
		System.out.println("Please enter valid browser");
	}
	
	driver.get(prop.getProperty("url"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	return driver;
	
}


public void inti_Config(){
	
	prop = new Properties();
	
	try {
		FileInputStream Fi = new FileInputStream("src/main/java/com/qa/Srit/Config/Config.properties");
		
		try {
			prop.load(Fi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
	
}

}
