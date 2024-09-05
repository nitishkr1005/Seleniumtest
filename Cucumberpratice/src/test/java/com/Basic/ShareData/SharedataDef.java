package com.Basic.ShareData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SharedataDef {
	WebDriver driver;
	
	public SharedataDef(ShareClass share) {
		driver = share.setup();
	}
	
	@Then("^User checks if the \"([^\"]*)\" first name is present$")
	public void User_check_ifthe_first_name_is_present(String firstname) {
	String UsernameActual = driver.findElement(By.name("firstname")).getAttribute("value");	
	Assert.assertEquals(firstname, UsernameActual);
	}		
	
	@And("^User enter user \"([^\"]*)\" surname$")
	public void User_enter_user_surname(String surname) {
	driver.findElement(By.name("lastname")).sendKeys(surname);
	}
	
	@Then("^User check user \"([^\"]*)\" surname is present$")
	public void User_check_user_surname_is_present(String surname) {
	String surnameActual = driver.findElement(By.name("lastname")).getAttribute("value");	
	Assert.assertEquals(surname,surnameActual);
}
}
