package Selenium_Main;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleTables {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        List<WebElement> headers = driver.findElements(By.xpath("//*[@id='table1']/thead/tr/th"));
        for (WebElement header : headers) {
            System.out.print(header.getText() + " ");
        }
        System.out.println();

        List<WebElement> rows = driver.findElements(By.xpath("//*[@id='table1']/tbody/tr"));
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                System.out.print(cell.getText() + " ");
            }
            System.out.println();
        }

        driver.quit();
    }
}