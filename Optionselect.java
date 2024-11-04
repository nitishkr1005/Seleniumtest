package pratice.pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Optionselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		
	//	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul._1va75j")));
         List<WebElement> suggestions = driver.findElements(By.cssSelector("ul._1va75j li"));

         // Click on the third suggestion
         if (suggestions.size() >= 3) {
             suggestions.get(2).click();
         } else {
             System.out.println("Less than 3 suggestions available.");
         }
	}

}
