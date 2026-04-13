package Selenium_Main;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement simpleAlert = driver.findElement(By.xpath("//input[@id='alert1']"));
		simpleAlert.click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text :"+alert.getText());
		alert.accept();
		System.out.println("Simple alert successfully done");
		
		WebElement promptAlert = driver.findElement(By.xpath("//input[@id='prompt']"));
		promptAlert.click();
		alert.sendKeys("Jagadeep");
		alert.accept();
		System.out.println("Prompt alert successfully done");
		
		WebElement confirmationAlert = driver.findElement(By.xpath("//input[@id='confirm']"));
		confirmationAlert.click();
		alert.dismiss();
		System.out.println("Confirmation alert successfully done");
		
		
	}

}
