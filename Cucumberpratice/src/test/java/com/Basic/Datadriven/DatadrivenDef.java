package com.Basic.Datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class DatadrivenDef {
	ChromeDriver driver = new ChromeDriver();

	@Given("User needs to be on the Facebook page")
	public void User_need_to_be_on_the_Facebook_page() {
		driver.get("https://www.facebook.com/reg/");
	}
	
	@When("^User enters their \"([^\"]*)\" first name$")
	public void User_enter_their_first_name(String firstname) {
		driver.findElement(By.name("firstname")).sendKeys(firstname);
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
	@Then("^Mobile field should be blank$")
	public void Mobile_field_should_be_blank() {
	String phoneno = driver.findElement(By.name("reg_email__")).getAttribute("value");
	Assert.assertEquals("",phoneno);
	}
		
	@Then("^Browser should be closed$")
	public void Browser_should_be_closed() {
		driver.close();
	}

}
