package pratice.pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class aaaa {
	   public static void main(String[] args) {
		   //     System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://www.amazon.in");
		        WebElement accountLists = driver.findElement(By.xpath("//*[@id=\'nav-link-accountList\']/span"));
		        accountLists.click();

		        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\\'nav-link-accountList\\']/span"));
		        for (WebElement element : elements) {
		            System.out.println(element.getText());
		        }

		        driver.quit();
		    }
		}
