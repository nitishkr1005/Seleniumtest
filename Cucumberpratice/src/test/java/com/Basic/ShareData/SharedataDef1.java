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

public class SharedataDef1 {
	WebDriver driver;
	
	public SharedataDef1(ShareClass share) {
		driver = share.setup();
	}

	@Given("User needs to be on the Facebook page")
	public void User_need_to_be_on_the_Facebook_page() {
		driver.get("https://www.facebook.com/reg/");
	}
	
	@When("^User enters their \"([^\"]*)\" first name$")
	public void User_enter_their_first_name(String firstname) {
		driver.findElement(By.name("firstname")).sendKeys(firstname);
	}

	@Then("^Mobile field should be blank$")
	public void Mobile_field_should_be_blank() {
	String phoneno = driver.findElement(By.name("reg_email__")).getAttribute("value");
	Assert.assertEquals("",phoneno);
	}

}
