package com.clc.orange.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.clc.util.BrowserUtilities;

//added this line in local repo

public class DashboardPO {

	public static void main(String[] args) {
		String a = "a";
		String b = "b";
		
		/**
		 * 
		 * assert -- hard assert - if actual and expected not matc -- fail there itself
		 * dont process next lines.. static ..Assert.methoName
		 * 
		 * verify -- softassert --  - if actual and expected not match -- dont fail there itself .
		 * process next lines -- at the end..assertall (fail)
		 * methods... instance..object of softassertclass
		 * 
		 * 
		 * 
		 */
		
		SoftAssert verify = new SoftAssert();
		System.out.println("before");
		verify.assertEquals(10, 20);
		verify.assertEquals(a, b);
		System.out.println("after");
		
		verify.assertAll();
		
		
		
		
		
		
		
	}
	
	@FindBy(id="welcome")
	WebElement welcome;
	
	
	
	
	WebDriver driver;
	
	// mns ce2 
	// gpt cw2 -- get
	
		
	//Webelement
	//c2 f2 s2
	//act2 s2lr  -- get
	//des  -- is
	
	
	/*all -- select/deselect
	index/value/visibleText -- select/deselct
	getFirstSelected
	allOptions
	getAllSelected
	isMultiple
	*/
	
	
	
	
	//locators
	
	//id -- one page unique
	//nm -- category
	//class -- 
	
	
	//css -- 
	//xpath--  
	
	
	//tagname -- dyanmic tables
	
	//linktext
	//partiallinkText
	
	
	
	
	public String getWelcomeMessage(){

		//Actions actioncc = new Actions(driver);
		
		//driver.findElement(By.)
		
		
		if(BrowserUtilities.isElementPresent(welcome)){
			return welcome.getText();
		}
		return null;
	}
	
}
