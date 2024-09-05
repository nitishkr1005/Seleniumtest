package com.Basic.ShareData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ShareClass {
	
	WebDriver driver = null;
	
	@Before
	public WebDriver setup() {
		if(driver == null) {
			driver = new ChromeDriver();
		}
		return driver;
		}
	
	@After
	public void tearDown() {
		driver.quit();
		driver = null;
	}
	

}
