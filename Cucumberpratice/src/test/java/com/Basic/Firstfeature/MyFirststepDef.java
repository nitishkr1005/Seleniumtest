package com.Basic.Firstfeature;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class MyFirststepDef {
	ChromeDriver driver = new ChromeDriver();

	@Given("^User needs to be on the Facebook page$")
	public void User_need_to_be_on_the_Facebook_page() {
		
		driver.get("https://www.facebook.com/reg/");
	}
	
	@When("^User enters their first name$")
	public void User_enter_their_first_name() {
		driver.findElement(By.name("firstname")).sendKeys("Pakau");
	}

	@Then("^User checks if the first name is present$")
	public void User_check_ifthe_first_name_is_present() {
	String UsernameActual = driver.findElement(By.name("firstname")).getAttribute("value");	
	Assert.assertEquals("Pakau", UsernameActual);
	}		
}
