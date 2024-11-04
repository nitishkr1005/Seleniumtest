package testing.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTitle {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver","E:\\selenium-java-3.141.59");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=mypustak");
		driver.findElement(By.partialLinkText("mypustak.com")).click();
		String PageTitle = driver.getTitle();
		System.out.println("Title Of Page" + PageTitle );

	}

}
