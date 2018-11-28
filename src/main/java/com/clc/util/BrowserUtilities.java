package com.clc.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class BrowserUtilities {

	static private WebDriver driver = null;
	
	public static WebDriver getBrowserInstance(String whichBrowser,String url){
	
			switch (whichBrowser) {
			case "Firefox":
				System.setProperty("webdriver.gecko.driver", "E:\\MySofts\\geckodriver-v0.23.0-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
				break;
			case "Chrome":
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogesh\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				driver = new ChromeDriver();
				break;
			default:
				Assert.fail("No specificed browser support");
				break;
			}
		driver.get(url);
		return driver;		
	}
	
	
	public static WebDriver getDriver(){
		return driver;
	}
	
	
	public static boolean isElementPresent(WebElement element){
		try{
			return element.isDisplayed();
		}catch(Exception e){
			return false;
		}
		
	}
	
	
	
}
