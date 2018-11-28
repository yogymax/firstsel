package com.clc.sel.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserActivities {
	
	public static void main(String[] args) {
		launchBrowser();
	}
	//Webdriver -- browser
	//Webelement -- element of that page
	
	public static void launchBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogesh\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver(); // it will launch the browser  --
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		
		firstName.sendKeys("Amit");
		
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("kale");
		
		List<WebElement> genders = driver.findElements(By.name("sex"));
	
		for(WebElement gender :genders){
			if(gender.getAttribute("value").equals("Male")){
				gender.click();
				break;
			}
		}
		
		List<WebElement> yearOfExp = driver.findElements(By.name("exp"));
		
		for(WebElement year : yearOfExp){
				if(year.getAttribute("value").equals("6")){
					year.click();
					break;
				}
		}
		
		
		WebElement datePicker = driver.findElement(By.id("datepicker"));
		datePicker.sendKeys("18/11/2018");
		
		List<WebElement> profs = driver.findElements(By.name("profession"));
		String empProf [] = {"Manual Tester","Automation Tester"};
		
		for(String eProf : empProf){
			for(WebElement item : profs){
				if(item.getAttribute("value").equals(eProf)){
					item.click();
					break;
				}
			}
		}
		
				
		
		List<WebElement> tools = driver.findElements(By.name("tool"));
		String []empTools = {"QTP","Selenium Webdriver"};

		for(String etool: empTools){
			for(WebElement item : tools){
				if(item.getAttribute("value").equals(etool)){
					item.click();
					break;
				}
			}
		}

		
		
		WebElement continents = driver.findElement(By.id("continents"));
		Select dropdown = new Select(continents); // select class for dropdown
		dropdown.selectByVisibleText("Africa");
		boolean flag = dropdown.isMultiple();
		System.out.println("Continents -- "+flag);
		
		
		WebElement commands = driver.findElement(By.id("selenium_commands"));
		Select commandsDropdown = new Select(commands); // select class for dropdown
		 flag = commandsDropdown.isMultiple();
		System.out.println("Commands -- "+flag);
		String []cmds = {"Navigation Commands","Wait Commands","Browser Commands"};
		for(String cmd : cmds){
			commandsDropdown.selectByVisibleText(cmd);
		}
		
		
		
		
	}

}

