package pratice.pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintList {
	 public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();
	            driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	            WebElement listBox = driver.findElement(By.name("birthday_year"));
	            Select select=new Select(listBox);
	            List<WebElement> allOptions = select.getOptions();
	            for(int i=0;i<allOptions.size();i++)
	            {
	            WebElement option = allOptions.get(i);
	            String text = option.getText();
	            System.out.println(text);
	            }
	    }
	}
