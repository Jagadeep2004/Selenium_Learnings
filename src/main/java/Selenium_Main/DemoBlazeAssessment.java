package Selenium_Main;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoBlazeAssessment {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://www.demoblaze.com/");

        driver.findElement(By.id("login2")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername"))).sendKeys("anandkumar@gmail.com");

        driver.findElement(By.id("loginpassword")).sendKeys("Anandkumar@123");

        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("logInModal")));

  
        WebElement laptops = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Laptops']")));
        laptops.click();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='tbodyid']//h4[@class='card-title']/a")));
        
        List<WebElement> products = driver.findElements(By.xpath("//div[@id='tbodyid']//h4[@class='card-title']/a"));

        
        for (WebElement prod : products) {
            System.out.println(prod.getText());
        }

        driver.quit();
    }
}