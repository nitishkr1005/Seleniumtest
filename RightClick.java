package pratice.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
 //       System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        try {
            // Navigate to the specified URL
            driver.get("https://proxybay.pages.dev/");

            // Locate the link element using partial link text
            WebElement link = driver.findElement(By.partialLinkText("pirate-proxy.black/"));

            // Create an Actions object
            Actions actions = new Actions(driver);

            // Perform a right-click (context click) on the link element
            actions.contextClick(link).perform();

            // Note: Sending a key after right-clicking might not work as expected due to browser restrictions.
            // However, you can attempt to send keys or perform other actions here if necessary.
            // For demonstration, we will send the 't' key.
            actions.sendKeys("t").perform();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser session
            driver.quit();
        }
    }
}

