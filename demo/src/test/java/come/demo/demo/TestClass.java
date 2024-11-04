package come.demo.demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {
	
	@Test
	public void testLoginPage() {
		System.getProperty("webdriver.chrome.driver", "‪E:\\selenium-java-3.141.59\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
	}
}
