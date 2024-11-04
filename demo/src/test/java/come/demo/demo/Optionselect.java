package come.demo.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Optionselect {

    public static void main(String[] args) throws InterruptedException {
        // Set the path to your ChromeDriver
   //     System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        try {
            // Open Amazon
            driver.get("https://www.amazon.in");
            // Enter "iPhone" in the search box
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");
            // Use WebDriverWait to wait for the suggestions to appear
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".s-suggestion")));
            // Find the suggestions
            List<WebElement> suggestions = driver.findElements(By.cssSelector(".s-suggestion"));
            // Click on the third suggestion
            if (suggestions.size() >= 3) {
                suggestions.get(2).click();
            } else {
                System.out.println("Less than 3 suggestions available.");
            }
        } finally {
            // Close the browser
  //          driver.quit();
        }
    }
}
