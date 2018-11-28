package com.clc.orange.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.clc.util.BrowserUtilities;

//newly add
public class OrangeHRMLoginPO {

	@FindBy(id = "txtUsername")
	WebElement username; // driver.findElement(By.id("txtUsername))

	@FindBy(id = "txtPassword")
	WebElement password;

	@FindBy(id = "btnLogin")
	WebElement loginBtn;

	@FindBy(id = "spanMessage")
	WebElement errorMsg;

	// pageobject = list out all the elements of that page inside a class +
	// beviours

	public void enterUserName(String uname) {
		username.clear();
		username.sendKeys(uname);
	}

	public void enterPassword(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}

	public void login() {
		loginBtn.click();
	}

	public DashboardPO loginWithSuccess(){
		loginBtn.click();
		return PageFactory.initElements(BrowserUtilities.getDriver(),DashboardPO.class);
	}
	
	
	public String getErrorMessage(){
		if(BrowserUtilities.isElementPresent(errorMsg)){
			return errorMsg.getText();	
		}
		return null;
	}
	
	//pageobject = all elements of a page + methods
						// variables of type Webelement -- behaviors
}
