package Selenium_Main;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuappDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("sk@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Kiot@123");

		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();
		
//		List<WebElement> table = driver.findElements(By.xpath("//table/tr[@class = 'contactTableBodyRow']/td"));
//		
//		
//		for(WebElement e : table) {
//			System.out.print(e.getText()+" ");
//		}
		
		List<WebElement> contactNames = driver.findElements(By.xpath("//table[@id = 'myTable']/tr/td[2]"));
		
		int contactCount = contactNames.size();
		System.out.println("total contact count: "+contactCount);
		
		for(WebElement name:contactNames) {
			System.out.println(name.getText());
		}
		
		int i=0;
		for(WebElement name : contactNames) {
			if(name.getText().equals("Jagadeep K C")) {
				List<WebElement> actualRowData = driver.findElements(By.xpath("//table[@id='mytable']/tr[" + i + "]"));
				
				for(WebElement row : actualRowData) {
					System.out.println(row.getText());
				}
			}
			i++;
		}
		
//		WebElement selectData = driver.findElement(By.xpath("//button[@id='add-contact']"));
//		selectData.click();
//		WebElement fname = driver.findElement(By.xpath("//input[@id='firstName']"));
//		fname.sendKeys("Jagadeep");
//		WebElement lname = driver.findElement(By.xpath("//input[@id='lastName']"));
//		lname.sendKeys("K C");
//		WebElement dob = driver.findElement(By.xpath("//input[@id='birthdate']"));
//		dob.sendKeys("2004-12-15");
//		WebElement email1 = driver.findElement(By.xpath("//input[@id='email']"));
//		email1.sendKeys("jagadeep@gmail.com");
//		WebElement phoneNum = driver.findElement(By.xpath("//input[@id='phone']"));
//		phoneNum.sendKeys("7415963215");
//		WebElement street1 = driver.findElement(By.xpath("//input[@id='street1']"));
//		street1.sendKeys("Indira Nagar");
//		WebElement street2 = driver.findElement(By.xpath("//input[@id='street2']"));
//		street2.sendKeys("Mettur Dam");
//		WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
//		city.sendKeys("Salem");
//		WebElement country = driver.findElement(By.xpath("//input[@id='country']"));
//		country.sendKeys("India");
//		WebElement state = driver.findElement(By.xpath("//input[@id='stateProvince']"));
//		state.sendKeys("tamil Nadu");
//		WebElement postal = driver.findElement(By.xpath("//input[@id='postalCode']"));
//		postal.sendKeys("626589");
//		WebElement button = driver.findElement(By.xpath("//button[@id='submit']"));
//		button.click();	
		
		

	}

}
