package pratice.pratice;
import java.util.List;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Findthematchfromlist {
	
		 public static void main(String[] args) {
		System.out.println("Enter option to search:");
		try (Scanner sc = new Scanner(System.in)) {
			String eText=sc.next();
			int found=0;
			System.out.println("Searching....");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
			WebElement listBox = driver.findElement(By.name("birthday_year"));
			Select select=new Select(listBox);
			List<WebElement> allOptions = select.getOptions();
			for(int i=0;i<allOptions.size();i++)
			{
			String atext = allOptions.get(i).getText();
			if(atext.equals(eText))	{
			found++;
			}
			}
			if(found==0) {
			System.out.println(eText+" is not found"); //No matching
			}
			else if(found==1) // if found >1 then duplicates 
			{
			System.out.println(eText+" is found"); //matching found
			} driver.close();
		}	} }
