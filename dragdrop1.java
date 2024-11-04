package pratice.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop1 {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
  //      System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to a demo page with a drag and drop feature
            driver.get("https://jqueryui.com/droppable/");

            // Switch to the iframe that contains the drag and drop elements
            driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

            // Locate the draggable element
            WebElement draggable = driver.findElement(By.id("draggable"));

            // Locate the droppable element
            WebElement droppable = driver.findElement(By.id("droppable"));

            // Create an Actions object
            Actions actions = new Actions(driver);

            // Perform the drag and drop action
            actions.dragAndDrop(draggable, droppable).perform();

            // Print a success message
            System.out.println("Drag and Drop performed successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser session
            driver.quit();
        }
    }
}
