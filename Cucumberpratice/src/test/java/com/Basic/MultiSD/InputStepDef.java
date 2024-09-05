package com.Basic.MultiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class InputStepDef {
	ChromeDriver driver = new ChromeDriver();
	
	@Given("^User needs to be on Automation testing$")
	public void User_needs_tobeon_Automation_testing() {
	driver.get("https://demo.automationtesting.in/Register.html");
	}
	
	@When("^User enter First name$")
	public void User_enter_First_name() {
	driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[1]/div[1]/input")).sendKeys("John");	
	}
	
	@Then("^User enter Last name$")
	public void User_enter_Last_name() {
	driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[1]/div[2]/input")).sendKeys("Wick");
	}
	
	@Then("^Check First name is present$")
	public void Check_First_name_is_present() {
	String firstnameactual = driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[1]/div[1]/input")).getAttribute("value");
	Assert.assertEquals("John",firstnameactual);
	}
	
	@Then("^Check Last name is present$")
	public void Check_Last_name_is_present() {
	String lastnameactual = driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[1]/div[2]/input")).getAttribute("value");
	Assert.assertEquals("Wick", lastnameactual);
	}
	
	@After
	public void teardown() {
		driver.close();
	}
}
