package pratice.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class MakeMyTripAutoSuggestions {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
   //     System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to www.makemytrip.com
            driver.get("https://www.makemytrip.com");

            // Maximize the browser window
            driver.manage().window().maximize();

            // Create WebDriverWait instance
            WebDriverWait wait = new WebDriverWait(driver, 10);
            Thread.sleep(4000);
            // Close any pop-up if it appears
            try {
                WebElement firstPopupCloseButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("commonModal__close"))); //#SW > div.landingContainer.eng > div.headerOuter > div.imageSliderModal.modal.displayBlock.modalLogin.dynHeight.personal > div > section > span
                firstPopupCloseButton.click();
            } catch (Exception e) {
                System.out.println("First popup not found or not clickable.");
            }
          
            // Close the second popup if it appears
            try {
                WebElement secondPopupCloseButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("//*[@id=\'webklipper-publisher-widget-container-notification-close-div\']/i"))); ////*[@id="webklipper-publisher-widget-container-notification-close-div"]/i
                secondPopupCloseButton.click();
            } catch (Exception e) {
                System.out.println("Second popup not found or not clickable.");
            }

            // Locate the "from" field and enter "Bang"
            WebElement fromField = wait.until(ExpectedConditions.elementToBeClickable(By.id("fromCity")));
            fromField.click();
            WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='From']")));
            inputField.sendKeys("Bang");

            // Wait for the autosuggestions to appear
            List<WebElement> suggestions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("ul.react-autosuggest__suggestions-list li")));

            // Count the number of autosuggestions displayed
            int numberOfSuggestions = suggestions.size();
            System.out.println("Number of autosuggestions: " + numberOfSuggestions);

            // Print all the autosuggestions
            System.out.println("Autosuggestions:");
            for (WebElement suggestion : suggestions) {
                System.out.println(suggestion.getText());
            }

            // Print the second option without using index
            if (numberOfSuggestions >= 2) {
                String secondOption = "";
                boolean foundFirst = false;
                for (WebElement suggestion : suggestions) {
                    if (suggestion.getText().contains("Bangalore")) {
                        if (foundFirst) {
                            secondOption = suggestion.getText();
                            break;
                        }
                        foundFirst = true;
                    }
                }
                System.out.println("Second option: " + secondOption);
            } else {
                System.out.println("Not enough suggestions to find a second option.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
 //           driver.quit();
        }
    }
}
