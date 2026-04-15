package Selenium_Main;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.hyrtutorials.com/");
		
		try {
			WebElement element=driver.findElement(By.xpath("//a[@class='bmc-btn']"));
			
			TakesScreenshot ts=(TakesScreenshot) element;
			
			File source=element.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source, new File("D:\\Selenium Images\\logo2.png"));
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		driver.close();
		
	}
}