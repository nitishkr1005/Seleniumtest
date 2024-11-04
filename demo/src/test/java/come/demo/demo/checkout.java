package come.demo.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class checkout {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://askomdch.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#menu-item-1228 > a")).click();
		driver.findElement(By.xpath("//*[@id=\'woocommerce-product-search-field-0\']")).sendKeys("Blue");
		driver.findElement(By.xpath("//*[@id=\'woocommerce_product_search-1\']/form/button")).click();
		driver.findElement(By.xpath("//*[@id=\'main\']/div/ul/li[2]/div[2]/a[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\'main\']/div/ul/li[2]/div[2]/a[3]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\'post-1220\']/div/div/div/div/div[2]/div/table/tbody/tr[4]/td/strong/span/bdi")).getText(),"$112.50");
		driver.findElement(By.xpath("//*[@id=\'post-1220\']/div/div/div/div/div[2]/div/div/a")).click();
		driver.findElement(By.id("billing_first_name")).sendKeys("pankaj");
		driver.findElement(By.id("billing_last_name")).sendKeys("Udaas");
		driver.findElement(By.id("billing_company")).sendKeys("muzzafarpur company");
		driver.findElement(By.id("billing_address_1")).sendKeys("muzzafar");
		driver.findElement(By.id("billing_address_2")).sendKeys("kanpur");
		driver.findElement(By.id("billing_city")).sendKeys("lucknow");
		//WebElement dropdown = driver.findElement(By.xpath("//*[@id=\'billing_state_field\']/span/span/span[1]/span"));
		//Select select = new Select(dropdown);

		// Select by visible text
	//	select.selectByIndex(20);
		driver.findElement(By.id("billing_postcode")).sendKeys("501105");
		driver.findElement(By.id("billing_email")).sendKeys("pankku@gmail.com");
		driver.findElement(By.name("payment_method_cod")).click(); 
		driver.findElement(By.id("place_order")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\'post-1221\']/div/div/div/div/div[2]/div/a")).click(); 
		driver.findElement(By.name("username")).sendKeys("pankaj");
		driver.findElement(By.id("password")).sendKeys("kumar");
		driver.findElement(By.name("login")).click();
		
	}

}
