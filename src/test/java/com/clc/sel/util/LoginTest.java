package com.clc.sel.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.clc.orange.pageobjects.DashboardPO;
import com.clc.orange.pageobjects.OrangeHRMLoginPO;
import com.clc.util.BrowserUtilities;
import com.clc.util.ExcelRead;

public class LoginTest {
	
	
	@Test(dataProviderClass=ExcelRead.class, dataProvider="getUserCredentails",enabled=false)
	public void verifyUserCredentails(String uname,String pwd,String emsg){
		WebDriver driver = BrowserUtilities.getBrowserInstance("Chrome", "https://opensource-demo.orangehrmlive.com");
		OrangeHRMLoginPO loginPage =PageFactory.initElements(driver, OrangeHRMLoginPO.class);
		loginPage.enterUserName(uname);
		loginPage.enterPassword(pwd);
		
		if(emsg.equalsIgnoreCase("Success")){
			DashboardPO dashboard = loginPage.loginWithSuccess();
			Assert.assertEquals(dashboard.getWelcomeMessage(),"Welcome Admin");
		}else{
			loginPage.login();
			Assert.assertEquals(loginPage.getErrorMessage(),emsg);
		}
		
		driver.close();
	}

}
