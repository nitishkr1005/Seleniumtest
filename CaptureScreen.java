package pratice.pratice;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreen {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		 File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 // Set the destination file path
         String filePath = "E:\\Download\\facebook1.png";
         File destinationFile = new File(filePath);
         FileUtils.copyFile(screenshot, destinationFile);
         System.out.println("Screenshot captured and saved as: " + destinationFile);
	}

}

