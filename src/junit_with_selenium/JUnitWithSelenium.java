package junit_with_selenium;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitWithSelenium {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");

        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
        element.click();
        element.sendKeys("Pencil");
        element.sendKeys(Keys.ENTER);

        driver.close();


    }
}
