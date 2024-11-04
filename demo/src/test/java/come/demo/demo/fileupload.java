package come.demo.demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class fileupload {
    public static void main(String[] args) {
        // Set up WebDriver (Ensure the path to your WebDriver executable is correct)
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the page with the file upload input
            driver.get("https://send-anywhere.com/");

            // Locate the file input element
            WebElement fileInput = driver.findElement(By.cssSelector("input[type='file']"));

            // Specify the path of the file to upload
            String filePath = "C:\\Users\\Lenovo\\Downloads\\IMG_20231022_151344.jpg";

            // Send the file path to the file input element
            fileInput.sendKeys(filePath);

            // Wait until the "Send" button is clickable
            driver.findElement(By.cssSelector("button.send-button-class")); // Update with actual class or ID

            // Click the "Send" button
     //       sendButton.click();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
         //   driver.quit();
        }
    }
}

