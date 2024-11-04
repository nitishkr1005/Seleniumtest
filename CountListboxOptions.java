package pratice.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class CountListboxOptions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
 //           WebElement listbox = driver.findElement(By.name("")); // Replace with the actual ID of the listbox
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
