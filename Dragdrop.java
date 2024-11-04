package pratice.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String url="http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html";
		driver.get(url);
		Actions actions=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement target=driver.findElement(By.xpath("//h1[text()='Block 3']"));
		actions.dragAndDrop(source, target).perform();
		}
		}

