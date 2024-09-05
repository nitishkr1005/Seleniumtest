package com.Basic.MultiSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class GooglestepDef {

	ChromeDriver driver = new ChromeDriver();
	
	@Given("^User needs to be on google$")
	public void User_needs_tobeon_google() {
		driver.get("https://www.google.co.in/");		
	}
	
	
	@When("^User enter search String$")
	public void User_enter_search_String() {
	driver.findElement(By.xpath("//*[@id=\'APjFqb\']")).sendKeys("automation testing");		
	}
	
	@After
	public void teardown() {
		driver.close();
	}
}
